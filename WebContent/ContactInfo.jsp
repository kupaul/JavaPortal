<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Result Page</title>
<link rel="stylesheet" type="text/css" href="Home_css/home.css">
</head>
<body>
<form  id="formId" action="" method="post">
<div  style="background-image: url('Login_css/images/4.jpg');">
<table width="100%">
<tr class="topnav">
	<td><b>Welcome   ${userName}</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><a href="Login.jsp" ><b>Logout</b></a></td>
</tr>
<tr></tr>
</table>
<table style="with: 80%">
<table align="center" cellpadding = "10" >
    
   
    <tr> <td style="color:#FF7A00" style=><h3><u>Contact Information</u></h3></td> </tr>
     <tr>
     <td width="25%" style="color:white"><b>First Name:</b></td>
     <td width="25%" style="color:white">${first_name}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Last Name:</b></td>
     <td width="25%" style="color:white">${last_name}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>DOB:</b></td>
     <td width="25%" style="color:white">${dob}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Marital Status:</b></td>
     <td width="25%" style="color:white">${marital_status}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Primary Phone no.:</b></td>
     <td width="25%" style="color:white">${ph_no}</td>
    </tr>
     <tr>
     <td width="25%" style="color:white"><b>Home Ph No:</b>  </td>
    <td width="25%" style="color:white">${home_no}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Work Ph No.:</b></td>
     <td width="25%" style="color:white">${work_no}</td>
    </tr>
      <tr>
     <td width="25%" style="color:white"><b>Mobile No.:</b></td>
     <td width="25%" style="color:white">${mobile_no}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Address:</b></td>
     <td width="25%" style="color:white">${address}</td>
    </tr>
     <tr>
     <td width="25%" style="color:white"><b>Address Type:</b></td>
     <td width="25%" style="color:white">${address_type}</td>
    </tr>
    <tr>
      <td width="25%" style="color:white"><b>License:</b></td>
     <td width="25%" style="color:white">${license}</td>
    </tr>
     <tr>
     <td width="25%" style="color:white"><b>License State:</b></td>
     <td width="25%" style="color:white">${license_state}</td>
    </tr>
     <tr>
     <tr>
     <td width="25%" style="color:white"><b>SSN:</b></td>
     <td width="25%" style="color:white">${ssn}</td>
    </tr>
    
     
        <tr>
                    <td><button class="favorite styled" formaction="Home.jsp"> GO BACK </button></td>
                </tr>
      
   
   </table>
   
   
 	
 

</body>
</html>