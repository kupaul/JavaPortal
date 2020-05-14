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

import com.example.search.ContactInfo;
import com.example.search.policysearchportalapi.PolicySearchPortalAPI;
import com.example.search.policysearchportalapi.PolicySearchPortalAPIPortType;
import com.example.search.policysearchportalapi.WsiAuthenticationException_Exception;

public class ContactInfoServlet extends HttpServlet{
	
public static final long serialVersionUID = 1L;
	
	public ContactInfoServlet() {
		super();
	}
	
	Logger logger = Logger.getLogger(ContactInfoServlet.class.getName());

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html");
		 logger.info("Inside ContactInfoServlet");
		 
		 try {
			 
			 String contactPublicId = request.getParameter("contactid");
			 
			 	PolicySearchPortalAPI api = new PolicySearchPortalAPI();
				PolicySearchPortalAPIPortType port = api.getPolicySearchPortalAPISoap11Port();
				
				BindingProvider bp = (BindingProvider)port;
				
				//Set Authentication parameters to SoapHeader
				Map<String, Object> requestContext = bp.getRequestContext();
				requestContext.put(BindingProvider.USERNAME_PROPERTY, "su");
				requestContext.put(BindingProvider.PASSWORD_PROPERTY, "gw");
			 
			   ContactInfo conInfo = port.getContactInfo(contactPublicId);
			   
			   String firstName = conInfo.getContactFirstName();
			   String lastName = conInfo.getContactLastName();
			   String dob = conInfo.getDateOfBirth();
			   String maritalStatus = conInfo.getMaritalStatus();
			   String primaryPhone = conInfo.getPrimaryPhone();
			   String address = conInfo.getAddress();
			   String addressType = conInfo.getAddressType();
			   String license = conInfo.getLicense();
			   String licenseState = conInfo.getLicenseState();
			   String ssn = conInfo.getSSNOfficialID();
			   String homePhone = conInfo.getHomePhone();
			   String workPhone = conInfo.getWorkPhone();
			   String mobilePhone = conInfo.getMobilePhone();
			   
			     request.setAttribute("ContactData", conInfo);
				 request.setAttribute("first_name", firstName);
				 request.setAttribute("last_name", lastName);
				 request.setAttribute("dob", dob);
				 request.setAttribute("marital_status", maritalStatus);
				 request.setAttribute("ph_no", primaryPhone);
				 request.setAttribute("address", address);
				 request.setAttribute("address_type", addressType);
				 request.setAttribute("license", license);
				 request.setAttribute("license_state", licenseState);
				 request.setAttribute("ssn", ssn);
				 request.setAttribute("home_no", homePhone);
				 request.setAttribute("work_no", workPhone);
				 request.setAttribute("mobile_no", mobilePhone);
				 
				 String resultJSP = "/ContactInfo.jsp";
				   RequestDispatcher dispatcher = 
						   getServletContext().getRequestDispatcher(resultJSP);
						  dispatcher.forward(request, response);
			   
		 }
		   catch (WsiAuthenticationException_Exception e) {
			 e.printStackTrace();
		}
	}
	

}
