package com.gw.searchPortal.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gw.searchPortal.Bean.UserLoginBean;
import com.gw.searchPortal.Dao.UserDao;

public class RegisterServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Copying all the input parameters in to local variables
		 String firstName = request.getParameter("firstName");
		 String email =    request.getParameter("email");
		 String userName = request.getParameter("userName");
		 String password = request.getParameter("password");
		 String lastName = request.getParameter("lastName");
		 String contact =  request.getParameter("contact");
		 
		 
		 UserLoginBean registerBean = new UserLoginBean();
		//Using Java Beans - An easiest way to play with group of related data
		 registerBean.setfirstName(firstName);
		 registerBean.setEmail(email);
		 registerBean.setUserName(userName);
		 registerBean.setPassword(password); 
		 registerBean.setLastName(lastName);
		 registerBean.setContact(contact);
		 
		 UserDao registerDao = new UserDao();
		 
		//The core Logic of the Registration application is present here. We are going to insert user data in to the database.
		 String userRegistered = registerDao.registerUser(registerBean);
		 
		 if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
		 {
			request.getRequestDispatcher("/Home.jsp").forward(request, response);
		 }
		 else   //On Failure, display a meaningful message to the User.
		 {
			request.setAttribute("errMessage", userRegistered);
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		 }
	 }

}
