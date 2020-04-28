<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Policy Search Portal  </title>
    <link rel="stylesheet" type="text/css" href="Home_css/home.css">

<script type="text/javascript">
function searchCheck() {
    if (document.getElementById('accountCheck').checked) {
        document.getElementById('ifAcc').style.visibility = 'visible';
    }
    else document.getElementById('ifAcc').style.visibility = 'hidden';
    
    if (document.getElementById('policyCheck').checked) {
        document.getElementById('ifPol').style.visibility = 'visible';
    }
    else document.getElementById('ifPol').style.visibility = 'hidden';
    
    if (document.getElementById('bothCheck').checked) {
        document.getElementById('ifBoth').style.visibility = 'visible';
    }
    else document.getElementById('ifBoth').style.visibility = 'hidden';

}
</script>
</head>
<body>


<form action="GWSearchAPIServlet" method="post">
<div  style="background-image: url('Login_css/images/1.jpg');">
<table width="100%">
<tr class="topnav">
	<td><b>Welcome   ${userName}</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><a href="Login.jsp" ><b>Logout</b></a></td>
</tr>
<tr></tr>
</table>
<table align="center" cellpadding = "18" >

<tr><td style="color:pink" style="font-size:50px"><b>Policy Search Portal</td></tr>

<tr ></tr><tr><td></td><td></td><td></td></tr>
					
				<tr>
				<td width="25%" style="color:white"><input type="radio"  onclick="javascript:searchCheck();" name="searchBy" 
                     id="accountCheck"   value="accountNumber" >Search by Account Number</td></tr>
                  <tr>   
                 <td style="color:white" align="center">
                 <div id="ifAcc" style="visibility:hidden">Please Enter Account No.
                         <input type="text" id='acc' name='acc' > 
                 </div>
                 </td>
                </tr>
                  <tr>
                     <td style="color:white"><input type="radio" onclick="javascript:searchCheck();" name="searchBy" 
                      id="policyCheck" value="policyNumber" >
					    Search by Policy Number</td></tr>
                   <tr> <td style="color:white" align="center"><div id="ifPol" style="visibility:hidden">Please Enter Policy No.
                         <input type="text" id='pol' name='pol' > 
                 </div>
                 </td> 
                </tr>
                <tr>
                   
                    <td style="color:white"><input type="radio" onclick="javascript:searchCheck();" name="searchBy" 
                    id="bothCheck" value="policyAndaccountNumber">
					    Search by Account & Policy Number</td></tr>
					    
                    <tr> <td style="color:white" align="center"><div id="ifBoth" style="visibility:hidden">Please Enter Account No.
                         <input type="text" id='acc2' name='acc2' > 
                         <br> Please Enter Policy No.
                         <input type="text" id='pol2' name='pol2' > 
                
                 </div>
				</tr>
				
				 <tr>
                    <td><button class="favorite styled" type="submit" value="submit">submit
</button></td>
                </tr>
                </table>
</div></form>

</body>
</html>