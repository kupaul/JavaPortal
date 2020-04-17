package com.guidewire.webservice;

import java.util.Map;
import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;

import org.apache.log4j.BasicConfigurator;

import com.example.search.AccountInfo;
import com.example.search.policysearchportalapi.PolicySearchPortalAPI;
import com.example.search.policysearchportalapi.PolicySearchPortalAPIPortType;
import com.example.search.policysearchportalapi.WsiAuthenticationException_Exception;


public class ExternalAPI {

	public static void main(String[] args) throws WsiAuthenticationException_Exception {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(ExternalAPI.class.getName());
		BasicConfigurator.configure();
		logger.info("This is my first log4j's statement");
		
		String accNo = "1914146684";
		
		PolicySearchPortalAPI api = new PolicySearchPortalAPI();
		PolicySearchPortalAPIPortType port = api.getPolicySearchPortalAPISoap11Port();
		
		BindingProvider bp = (BindingProvider)port;
		
		Map<String, Object> requestContext = bp.getRequestContext() ;
		requestContext.put(BindingProvider.USERNAME_PROPERTY,"su");
		requestContext.put(BindingProvider.PASSWORD_PROPERTY,"gw");
		
	
		AccountInfo accInfo = port.getAccountInfo(accNo);
		
		logger.info("Current email ID: " + accInfo.getAccountName());
	}

}
