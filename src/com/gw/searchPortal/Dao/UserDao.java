package com.gw.searchPortal.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gw.searchPortal.Bean.UserLoginBean;
import com.gw.searchPortal.Util.DBUtil;
import com.sun.media.jfxmedia.logging.Logger;

public class UserDao {
	
	public String registerUser(UserLoginBean registerBean)
	 {
		 String firstName = registerBean.getfirstName();
		 String email = registerBean.getEmail();
		 String userName = registerBean.getUserName();
		 String password = registerBean.getPassword();
		 String lastName = registerBean.getLastName();
		 String contact = registerBean.getContact();
		 
		 Connection con = null;
		 PreparedStatement preparedStatement = null;
		 
		 try
		 {
			 System.out.println("Before connecting to DB");
			 con = DBUtil.createConnection();
			 System.out.println("After connecting to DB");
			 String query = "insert into userInfo(username,firstName,password,lastName,email,contact) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
			 System.out.println("After the Query");
			 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
			
			 preparedStatement.setString(1, userName);
			 preparedStatement.setString(2, firstName);
			 preparedStatement.setString(3, password);
			 preparedStatement.setString(4, lastName);
			 preparedStatement.setString(5, email);
			 preparedStatement.setString(6, contact);
			 
			 int i= preparedStatement.executeUpdate();
			 
			 if (i!=0)  //Just to ensure data has been inserted into the database
			 return "SUCCESS"; 
		 }
		 catch(SQLException e)
		 {
			e.printStackTrace();
		 }
		 
		 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
	 }


}
