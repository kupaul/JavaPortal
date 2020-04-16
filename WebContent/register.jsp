<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>>GW Policy Search Portal</title>
</head>
<body>
 <form action="RegisterServlet" method="post">
 	<table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstName" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastName" /></td>
    </tr>
    <tr>
     <td>UserName * </td>
     <td><input type="text" name="userName" /></td>
    </tr>
    <tr>
     <td>Password *</td>
     <td><input type="password" name="password" /></td>
    </tr>
    <tr>
     <td>Email ID</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
     <td>Contact No</td>
     <td><input type="text" name="contact" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
 </form>
</body>
</html>