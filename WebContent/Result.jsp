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
	function callMe(val1){
		var c = val1;
		/*alert("value is " + c); 
		alert("inside callMe");*/
    document.getElementById('pol').value = c;
    document.getElementById('formId').submit();
	}
</script>
</head>
<body>

<form id="formId" action="PolicySearchServlet" method="post">
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
              <a id="linkId" href="#" onclick="javascript:callMe(<%=s%>);"><%=s%></a>
               <input type='hidden' id= 'pol' name='pol' />
              </td> 
			<%}%>
    </tr>

   <tr> <td width="25%" style="color:yellow"><h3><u>Contact Names</u></h3></td> </tr>
       <tr>
             <%ArrayList<String> conName =  
            (ArrayList<String>)request.getAttribute("Conatact_Name"); 
             for(String names:conName){%> 
             <td width="25%" style="color:white"><%=names%></td> 


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