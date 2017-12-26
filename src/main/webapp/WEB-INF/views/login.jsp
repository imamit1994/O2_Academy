<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>

	  <link href="resources/css/stylish-portfolio.css" rel="stylesheet">
	 <script src="resources/vendor/jquery/jquery.min.js"></script>
	 <script src="resources/js/main.js"></script>
	 <link href="resources/css/main.css" rel="stylesheet">
</head>
<body>

	<div class="wrapper">

<h2>Login</h2>

<form:form action="userdashboard" modelAttribute="loginForm" id="form">
  
  <div class="container">
  	<div>
    <p id="logincredentialerror">You have entered wrong Id or Password</p>
    </div>

    <label><b>Associate Id</b></label>
    <form:input type="text" placeholder="Enter Associate Id" path="associateId" required="required" id="associateId"></form:input>

    <label><b>Password</b></label>
    <form:input type="password" placeholder="Enter Password" name="password" path="password" required="required" id="password"></form:input>


    <button type="submit" id="userloginsubmit">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  </div>

  <div class="container1">

    <span class="password">Forgot <a href="#">password?</a></span>
  </div>
</form:form>
</div>>
</body>
</html>