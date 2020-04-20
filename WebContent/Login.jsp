<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Login_css/css/util.css">
	<link rel="stylesheet" type="text/css" href="Login_css/css/main.css">
<title>GW Policy Search Portal</title>
</head>
<body>
	<form action="LoginServlet" method="post">
        <fieldset style="width: 1350px">
           
            <div class="limiter">
		
		<div class="container-login100" style="background-image: url('Login_css/images/1.jpg');">
			<div class="wrap-login100">
			
				<form class="login100-form validate-form">
					<span class="login100-form-logo">
						<i class="zmdi zmdi-landscape"></i>
					</span>

					<span class="login100-form-title p-b-34 p-t-27">
						Log in
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Enter username">
						<input class="input100" style="color:#900C3F;" type="text" name="username" placeholder="Username">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter password">
						<input class="input100" style="color:#900C3F;" type="password" name="pass" placeholder="Password">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Login
						</button>
					</div>
<a href="register.jsp" class="form-log-in-with-existing">You Don't have an account? <b> Register here </b></a>
					
				</form>
			</div>
		</div>
	</div>
        </fieldset>
        
    </form>
</body>
</html>