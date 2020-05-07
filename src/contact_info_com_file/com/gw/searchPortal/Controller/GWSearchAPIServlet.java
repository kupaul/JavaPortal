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
import com.example.search.PolicyInfo;
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
			 String polNo = request.getParameter("pol");
			
			
			 	PolicySearchPortalAPI api = new PolicySearchPortalAPI();
				PolicySearchPortalAPIPortType port = api.getPolicySearchPortalAPISoap11Port();
				
				BindingProvider bp = (BindingProvider)port;
				
				//Set Authentication parameters to SoapHeader
				Map<String, Object> requestContext = bp.getRequestContext();
				requestContext.put(BindingProvider.USERNAME_PROPERTY, "su");
				requestContext.put(BindingProvider.PASSWORD_PROPERTY, "gw");
				
						
			   if(accNo!=null) {
			// Get the contact information
				AccountInfo accInfo = port.getAccountInfo(accNo);
			 
			    logger.info("AccountName: " + accInfo.getAccountName());
				String accName = accInfo.getAccountName();
				String accNum = accInfo.getAccountNumber();
				String accStat = accInfo.getStatus();
				String accPh = accInfo.getPhoneNumber();
				String accEmail = accInfo.getEmail();
				ArrayList<String> policylist=(ArrayList<String>) accInfo.getPolicies().getEntry();
				ArrayList<String> contactList=(ArrayList<String>) accInfo.getAccountContact().getEntry();
				String accAdd = accInfo.getAddress();
	
				
				logger.info("Account holder's name : " + accInfo.getAccountName());
				logger.info("Account holder's Policies : " + accInfo.getPolicies().getEntry().toString());
				logger.info("Account holder's contactList : " + accInfo.getAccountContact().getEntry().toString());
				
				
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
						 
			
			   }
			  
			   
			   if(polNo!=null) {
					 
					 logger.info("Inside PolicySearch"); 
					 
					 PolicyInfo polInfo = port.getPolicyInfo(polNo);
					 
					 String polNumber = polInfo.getPolicyNumber();
					 String product = polInfo.getProduct();
					 String ssn = polInfo.getSSN();
					 String issued = polInfo.getIssued();
					 String issueDate = polInfo.getIssueDate();
					 String underWriter = polInfo.getUnderwriter();
					 String policyHolderName = polInfo.getPrimaryNamedInsured();
					 String accNum = polInfo.getAccountNumber();
					 String polAccName = polInfo.getAccountName();
					 String polAddress = polInfo.getAddress();
					 String addressType = polInfo.getAddressType();
					 
					    logger.info("Account holder's name : " + polInfo.getAccountName());
						logger.info("Policy Number : " + polInfo.getPolicyNumber());
						logger.info("Product : " + polInfo.getProduct());
						logger.info("SSN : " + polInfo.getSSN());
						logger.info("Account holder's name : " + polInfo.getAddress());
						logger.info("Address : " + polInfo.getAddressType());
						logger.info("Account Number : " + polInfo.getAccountNumber());
					 
					 request.setAttribute("pnumber", polNumber);
					 request.setAttribute("product", product);
					 request.setAttribute("ssn", ssn);
					 request.setAttribute("issued", issued);
					 request.setAttribute("first_issued_date", issueDate);
					 request.setAttribute("underwriter", underWriter);
					 request.setAttribute("pni_name", policyHolderName);
					 request.setAttribute("AccNumber", accNum);
					 request.setAttribute("AccName", polAccName);
					 request.setAttribute("AccAddress", polAddress);
					 request.setAttribute("AddressType", addressType);
					 
					 logger.info("After setting request");
					 
					// String resultJSP = "/PolicyResult.jsp";
					
					   RequestDispatcher dispatcher = 
							   getServletContext().getRequestDispatcher("/PolicyResult.jsp");
							  dispatcher.forward(request, response);
						
				   }
			   
			
			   
			   
		} catch (WsiAuthenticationException_Exception e) {
			e.printStackTrace();
		}
		
		
   
	}

}
