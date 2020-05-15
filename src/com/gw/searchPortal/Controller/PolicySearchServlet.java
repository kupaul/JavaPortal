package com.gw.searchPortal.Controller;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.BindingProvider;

import com.example.search.PolicyInfo;
import com.example.search.policysearchportalapi.PolicySearchPortalAPI;
import com.example.search.policysearchportalapi.PolicySearchPortalAPIPortType;
import com.example.search.policysearchportalapi.WsiAuthenticationException_Exception;

public class PolicySearchServlet extends HttpServlet {
	
	public static final long serialVersionUID = 1L;
	
	public PolicySearchServlet() {
		super();
	}
	
	Logger logger = Logger.getLogger(PolicySearchServlet.class.getName());

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html");
		 
		logger.info("Inside PolicySearchServlet");
		 
		try {
			String polNo = request.getParameter("pol");
			//String contactId = request.getParameter("contactid");
		 
		 	PolicySearchPortalAPI api = new PolicySearchPortalAPI();
			PolicySearchPortalAPIPortType port = api.getPolicySearchPortalAPISoap11Port();
			
			BindingProvider bp = (BindingProvider)port;
			
			//Set Authentication parameters to SoapHeader
			Map<String, Object> requestContext = bp.getRequestContext();
			requestContext.put(BindingProvider.USERNAME_PROPERTY, "su");
			requestContext.put(BindingProvider.PASSWORD_PROPERTY, "gw");
			
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
			 String pNIPublicId = polInfo.getPNIPublicID();
			 
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
			 request.setAttribute("pni_ID", pNIPublicId);
			 
			 logger.info("After setting request");
			 
			 String resultPage = "/PolicyInfo.jsp";
			  RequestDispatcher dispatcher = 
			   getServletContext().getRequestDispatcher(resultPage);
			  dispatcher.forward(request, response);
		 }
		 catch (WsiAuthenticationException_Exception e) {
				e.printStackTrace();
			}
	}

}
