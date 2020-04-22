package com.gw.searchPortal.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.BindingProvider;
import com.example.search.AccountInfo;
import com.example.search.policysearchportalapi.PolicySearchPortalAPI;
import com.example.search.policysearchportalapi.PolicySearchPortalAPIPortType;
import com.example.search.policysearchportalapi.WsiAuthenticationException_Exception;


public class GWSearchAPIServlet  extends HttpServlet {
	
	public static final long serialVersionUID = 1L;
	
	public GWSearchAPIServlet() {
		super();
	}
	
	Logger logger = Logger.getLogger(GWSearchAPIServlet.class.getName());

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html");

		try {
			 String accNo = request.getParameter("acc");
			
			 	PolicySearchPortalAPI api = new PolicySearchPortalAPI();
				PolicySearchPortalAPIPortType port = api.getPolicySearchPortalAPISoap11Port();
				
				BindingProvider bp = (BindingProvider)port;
				
				//Set Authentication parameters to SoapHeader
				Map<String, Object> requestContext = bp.getRequestContext();
				requestContext.put(BindingProvider.USERNAME_PROPERTY, "su");
				requestContext.put(BindingProvider.PASSWORD_PROPERTY, "gw");
						
			
			// Get the contact information
				AccountInfo accInfo = port.getAccountInfo(accNo);
			 
			    logger.info("AccountName: " + accInfo.getAccountName());
				String accName = accInfo.getAccountName();
				String accNum = accInfo.getAccountNumber();
				String accStat = accInfo.getStatus();
				String accPh = accInfo.getPhoneNumber();
				String accEmail = accInfo.getEmail();
				String accAdd = accInfo.getAddress();
			
				ArrayList<String> policylist=new ArrayList<String>();   
				/*policylist.add("6818018606");    
				policylist.add("8818014567");    
				policylist.add("6634018606");   */ 
			
				
				ArrayList<String> contactList=new ArrayList<String>();   
				/*contactList.add("Kuntal Paul");    
				contactList.add("Debrupa Dutta");    */
			   
				logger.info("Account holder's name : " + accInfo.getAccountName());
				logger.info("Account holder's Policies : " + accInfo.getPolicies());
				logger.info("Account holder's Policies::: " + policylist);
				logger.info("Account holder's contactList : " + contactList);
				
				
				
				
				 request.setAttribute("ContactData", accInfo);
				 
				 request.setAttribute("Name", accName);
				 request.setAttribute("Number", accNum);
				 request.setAttribute("Status", accStat);
				 request.setAttribute("Phone", accPh);
				 request.setAttribute("Email", accEmail);
				 request.setAttribute("Address", accAdd);
				 request.setAttribute("Policies", policylist);
				 request.setAttribute("Conatact_Name", contactList);
				 
				 String resultJSP = "/Result.jsp";
				  RequestDispatcher dispatcher = 
				   getServletContext().getRequestDispatcher(resultJSP);
				  dispatcher.forward(request, response);
				
				
				//response.sendRedirect("Result.jsp");
			   
		} catch (WsiAuthenticationException_Exception e) {
			e.printStackTrace();
		}

	}

}
