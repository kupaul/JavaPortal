<%@page import="com.gw.searchPortal.Util.JSPUtil"%>
<%@page import="com.example.search.AccountContactInfo"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
<link rel="stylesheet" type="text/css" href="Home_css/home.css">
<script type="text/javascript">
	function callMePol(val1){
		var c = val1;
    document.getElementById('pol').value = c;
    document.getElementById('formId').submit();
	}
	
	function callMeCon(val2){
		var a = val2;
    document.getElementById('contactid').value = a;
    document.getElementById('formId').submit();
	}
</script>
</head>
<body  style="background-image: url('Login_css/images/4.jpg');">

<form id="formId" action="AccountDataSearchDeciderServlet" method="post">
<div>
<table width="100%">
<tr class="topnav">
	<td><b>Welcome   ${userName}</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><a href="Login.jsp" ><b>Logout</b></a></td>
</tr>
<tr></tr>
</table>
<table style="with: 80%">
<table align="center" cellpadding = "30" >
    
    <tr> <td style="color:yellow" style=><h3><u>Account Information</u></h3></td> </tr>
    
    <tr>
     <td width="25%" style="color:white"><b>Account No:</b>  </td>
    <td width="25%" style="color:white">${Number}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Account Name:</b></td>
     <td width="25%" style="color:white">${Name}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Status:</b></td>
     <td width="25%" style="color:white">${Status}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Account Phone No:</b></td>
     <td width="25%" style="color:white">${Phone}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Account Email:</b></td>
     <td width="25%" style="color:white">${Email}</td>
    </tr>
    <tr>
     <td width="25%" style="color:white"><b>Account Address:</b></td>
     <td width="25%" style="color:white">${Address}</td>
    </tr>
    
    <tr> <td width="25%" style="color:yellow"><h3><u>Policies</u></h3></td> </tr>
        <tr>
             <%ArrayList<String> pol =  
            (ArrayList<String>)request.getAttribute("Policies"); 
             for(String s:pol){%> 
              <td width="25%" style="color:yellow">
              <a id="pollink" href="#" onclick="callMePol('<%=s%>');" style="color:#fff;"><%=s%></a>
               <input type='hidden' id= 'pol' name='pol' />
              </td> 
			<%}%>
    </tr>

   <tr> <td width="25%" style="color:yellow"><h3><u>Contact Names</u></h3></td> </tr>
       <tr>
             <%ArrayList<AccountContactInfo> conList =  
                     (ArrayList<AccountContactInfo>)request.getAttribute("ContactList");
             ArrayList<String> conNames =  
            (ArrayList<String>)request.getAttribute("Conatact_Name"); 
             for(String name:conNames){
             String c = JSPUtil.getContactID(conList, name);
             System.out.println("Contact Public ID::::"+c);%> 
             <td width="25%" style="color:white">
             <a id="conlink" href="#" onclick="callMeCon('<%=c%>');" style="color:#fff;"><%=name%></a>
               <input type='hidden' id= 'contactid' name='contactid' />
             </td> 
            <%}%>
    </tr>
        <tr>
                    <td><button class="favorite styled" formaction="Home.jsp"> GO BACK </button></td>
                </tr>
      
   
   </table>
   
   
 	
</table>
</div>
</form>
</body>
</html>