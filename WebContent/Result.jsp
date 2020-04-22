<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>

<table style="with: 80%">
    
    <tr> <td><h3><u>Account Information</u></h3></td> </tr>
    
    <tr>
     <td><b>Account No:</b>  </td>
     <td></td>
    <td>${Number}</td>
    </tr>
    <tr>
     <td><b>Account Name:</b></td>
     <td></td>
     <td>${Name}</td>
    </tr>
    <tr>
     <td><b>Status:</b></td>
     <td></td>
     <td>${Status}</td>
    </tr>
    <tr>
     <td><b>Account Phone No:</b></td>
     <td></td>
     <td>${Phone}</td>
    </tr>
    <tr>
     <td><b>Account Email:</b></td>
     <td></td>
     <td>${Email}</td>
    </tr>
    <tr>
     <td><b>Account Address:</b></td>
     <td></td>
     <td>${Address}</td>
    </tr>
 
      <tr> <td><h3><u>Policies</u></h3></td> </tr>
             
             <%ArrayList<String> pol =  
            (ArrayList<String>)request.getAttribute("Policies"); 
             for(String s:pol){%> 
               <tr> <td><%=s%></td> 
               
          
            <%}%>
    </tr>
    
   <tr> <td><h3><u>Contact Names</u></h3></td> </tr>
             
             <%ArrayList<String> conName =  
            (ArrayList<String>)request.getAttribute("Conatact_Name"); 
             for(String names:conName){%> 
               <tr> <td><%=names%></td> 
               
          
            <%}%>
    </tr>
    
   
   </table>
   
   
 	
 

</body>
</html>