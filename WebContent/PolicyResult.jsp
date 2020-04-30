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
<form >
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
    
    <tr> <td style="color:#FF7A00" style=><h3><u>Account Information</u></h3></td> </tr>
    
    <tr>
     <td width="25%" style="color:white"><b>Account No:</b>  </td>
    <td width="25%" style="color:white">${AccNumber}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Account Name:</b></td>
     <td width="25%" style="color:white">${AccName}</td>
    </tr>
   
    <tr>
     <td width="25%" style="color:white"><b>Account Address:</b></td>
     <td width="25%" style="color:white">${AccAddress}</td>
    </tr>
     <tr>
     <td width="25%" style="color:white"><b>Address Type:</b></td>
     <td width="25%" style="color:white">${AddressType}</td>
    </tr>
    <tr> <td style="color:#FF7A00" style=><h3><u>Official IDs</u></h3></td> </tr>
     <tr>
     <tr>
     <td width="25%" style="color:white"><b>SSN:</b></td>
     <td width="25%" style="color:white">${ssn}</td>
    </tr>
    <tr> <td style="color:#FF7A00" style=><h3><u>Policy</u></h3></td> </tr>
     <tr>
     <td width="25%" style="color:white"><b>Product:</b></td>
     <td width="25%" style="color:white">${product}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Number:</b></td>
     <td width="25%" style="color:white">${pnumber}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Issued:</b></td>
     <td width="25%" style="color:white">${issued}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>First Issued Date:</b></td>
     <td width="25%" style="color:white">${first_issued_date}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Underwriter:</b></td>
     <td width="25%" style="color:white">${underwriter}</td>
    </tr>
    <tr> <td style="color:#FF7A00" style=><h3><u>Primary Named Insuwhite</u></h3></td> </tr>
     <tr>
     <td width="25%" style="color:white"><b>Name:</b></td>
     <td width="25%" style="color:white">${pni_name}</td>
    </tr>
        <tr>
                    <td><button class="favorite styled" formaction="Home.jsp"> GO BACK </button></td>
                </tr>
      
   
   </table>
   
   
 	
 

</body>
</html>