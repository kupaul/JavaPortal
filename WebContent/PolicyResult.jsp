<%@page import="com.example.search.PolicyInfo"%>
<%@page import="com.gw.searchPortal.Util.JSPUtil"%>
<%@page import="com.example.search.AccountContactInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Result Page</title>
<link rel="stylesheet" type="text/css" href="Home_css/home.css">
<script type="text/javascript">
	function callMe(val1){
		var c = val1;
		/*alert("value is " + c); 
		alert("inside callMe");*/
    document.getElementById('acc').value = c;
    document.getElementById('formId').submit();
	}
	
	function callMeCon(val2){
		var a = val2;
    document.getElementById('contactid').value = a;
    document.getElementById('formId').submit();
	}
</script>
</head>
<body>
<form  id="formId" action="AccountDataSearchDeciderServlet" method="post">
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
    
   
    <tr> <td style="color:#FF7A00" style=><h3><u>Policy Information</u></h3></td> </tr>
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
     <tr> <td style="color:#FF7A00" style=><h3><u>Account Information</u></h3></td> </tr>
    
    <tr>
     <td width="25%" style="color:white"><b>Account No:</b>  </td>
    <td width="25%" style="color:white"><a id="linkId" href="#" 
    onclick="javascript:callMe(${AccNumber});" style="color:#fff;">${AccNumber}</a>
     <input type='hidden' id= 'acc' name='acc' />
    </td>
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
    <tr> <td style="color:#FF7A00" style=><h3><u>Primary Named Insured</u></h3></td> </tr>
     <tr>
     
     <%String contactID = (String)request.getAttribute("pni_ID");
     String conName = (String)request.getAttribute("pni_name");
     System.out.println("Contact Public ID::::"+contactID);%>
     <td width="25%" style="color:white">
     <a id="conlink" href="#" onclick="callMeCon('<%=contactID%>');" style="color:#fff;"><%=conName%></a>
     <input type='hidden' id= 'contactid' name='contactid' />
     </td>
    </tr>
        <tr>
                    <td><button class="favorite styled" formaction="Home.jsp"> GO BACK </button></td>
                </tr>
      
   
   </table>
   
   
 	
 

</body>
</html>