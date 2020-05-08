package com.gw.searchPortal.Controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccountDataSearchDeciderServlet extends HttpServlet {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	
	public AccountDataSearchDeciderServlet() {
		super();
	}
	
	Logger logger = Logger.getLogger(GWSearchAPIServlet.class.getName());

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html");
		logger.info("Inside AccountDataSearchDeciderServlet");
		
		String policyNumber = request.getParameter("pol");
		String contactId = request.getParameter("contactid");
		
		logger.info("Policy No is" +policyNumber );
		 logger.info("Contact Id" +contactId );
		
		if(policyNumber!=null && !policyNumber.isEmpty()) {
			logger.info("Inside if..");
			request.getRequestDispatcher("/PolicySearchServlet").include(request, response);
			
		}else if(contactId!=null && !contactId.isEmpty()) {
			logger.info("Inside else..");
			request.getRequestDispatcher("/ContactInfoServlet").include(request, response);
		}
		
	}
		

}
