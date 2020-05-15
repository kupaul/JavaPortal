package com.gw.searchPortal.Controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataSearchDeciderServlet extends HttpServlet {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	
	public DataSearchDeciderServlet() {
		super();
	}
	
	Logger logger = Logger.getLogger(GWSearchAPIServlet.class.getName());

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html");
		logger.info("Inside DataSearchDeciderServlet");
		
		String policyNumber = request.getParameter("pol");
		String contactId = request.getParameter("contactid");
		String accNumber = request.getParameter("acc");
		
		logger.info("Policy No is" +policyNumber );
		 logger.info("Contact Id" +contactId );
		 logger.info("Account number is" +accNumber );
		
		if(policyNumber!=null && !policyNumber.isEmpty()) {
			logger.info("Inside if..");
			request.getRequestDispatcher("/PolicySearchServlet").include(request, response);
			
		}else if(contactId!=null && !contactId.isEmpty()) {
			logger.info("Inside else..");
			request.getRequestDispatcher("/ContactInfoServlet").include(request, response);
		}else if(accNumber!=null && !accNumber.isEmpty()) {
			logger.info("Inside else..");
			request.getRequestDispatcher("/AccountSearchServlet").include(request, response);
		}
		
	}
		

}
