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



public class GWSearchAPIServlet  extends HttpServlet {
	
	public static final long serialVersionUID = 1L;
	
	public GWSearchAPIServlet() {
		super();
	}
	
	Logger logger = Logger.getLogger(GWSearchAPIServlet.class.getName());

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html");
		
		String accNo = request.getParameter("acc");
		String polNo = request.getParameter("pol");
		 
		logger.info("Account no is" +accNo );
		 logger.info("Policy no is" +polNo );
		
		if(accNo!=null && !accNo.isEmpty()) {
			logger.info("Inside if..");
			request.getRequestDispatcher("/AccountSearchServlet").include(request, response);
			
		}else if(polNo!=null && !polNo.isEmpty()) {
			logger.info("Inside else..");
			request.getRequestDispatcher("/PolicySearchServlet").include(request, response);
		}
		

		
		
   
	}

}
