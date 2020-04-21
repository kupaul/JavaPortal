<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>GW POLICY SEARCH PORTAL</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="registration_css/css/style.css">
</head>
<body>
 <form action="RegisterServlet" method="post">
 	<div class="main">

        <div class="container">
            <div class="signup-content">
                <form method="POST" id="signup-form" class="signup-form">
                    <h2>Sign up </h2>
                    <div class="form-group">
                        <input type="text" class="form-input" name="firstName" id="firstName" placeholder="Your First Name"/>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-input" name="lastName" id="lastName" placeholder="Your Last Name"/>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-input" name="userName"" id="userName"" placeholder="User Name"/>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-input" name="password"" id="password"" placeholder="Password"/>
                        <span toggle="#password" class="zmdi zmdi-eye field-icon toggle-password"></span>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-input" name="contact"" id="contact"" placeholder="Contact"/>
                    </div>
              
                    <div class="form-group">
                        <input type="email" class="form-input" name="email" id="email" placeholder="Email"/>
                    </div>
                     <div class="form-group">
                        <input type="submit" name="submit" id="submit" class="form-submit submit" value="Sign up"/>
                    </div>
                </form>
            </div>
        </div>

    </div>
 </form>
</body>
</html>