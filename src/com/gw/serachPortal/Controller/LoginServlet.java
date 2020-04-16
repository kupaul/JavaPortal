package com.gw.serachPortal.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gw.searchPortal.Util.DBUtil;


public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		
	
		
		try {
			
		Connection	 conn =  DBUtil.createConnection();
 
		System.out.println("<<<<User name>>>> "+ un );
		System.out.println("<<<Password>>> "+ pw );
		 
		if(un !=null) {
			 HttpSession session = request.getSession();
			 session.setAttribute("userName", un);
		}
		
		PreparedStatement ps = conn.prepareStatement("select userName,password from userInfo where username=? and password=?");
		ps.setString(1, un);
		ps.setString(2, pw);
 
		ResultSet rs = ps.executeQuery();
	
		while (rs.next()) {
			System.out.println("----For Home.jsp--");
			response.sendRedirect("Home.jsp");
			return;
		}
		
		System.out.println("----For Error.jsp----");
		response.sendRedirect("Error.jsp");
		return;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}






