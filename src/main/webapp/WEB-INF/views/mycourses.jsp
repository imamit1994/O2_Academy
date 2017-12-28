<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<%@ page isELIgnored="false"%>
<link href="resources/css/stylish-portfolio.css" rel="stylesheet">
<script src="resources/vendor/jquery/jquery.min.js"></script>
<script src="resources/js/main.js"></script>
<link href="resources/css/main.css" rel="stylesheet">
<link href="resources/vendor/bootstrap/css/bootstrap.css"
	rel="stylesheet">

<style>
.jumbotron {
	padding: 2rem 1rem;
	margin-bottom: 2rem;
	background-color: #1d2124;
	border-radius: 0.3rem;
	color: white;
}
</style>


</head>
<body>

	<!--Header-->
	<div class="wrapper">
		<div class="jumbotron">
			<h1>
				O<sub>2</sub> Academy
			</h1>
			<h3>Learn Almost Anything !!!</h3>
		</div>

		<!--Navigation Bar-->
		<nav>
		<ul>
            <li><a href="selectCourse">Select Courses</a></li>
            <li><a href="dashbordotherthanlogin">Dashbord</a></li>
		</ul>
		</nav>

		<!--Log out-->
		<a href="signout"><button class="log_out" type="submit" id="sub">Sign Out</button></a>



		<!--web content-->
		<div class="container">
			<div class="row">
				<div class="wrapper">
					<h1>My Courses</h1>
					<div>
						<table class="table ">
							<tr>
								<td class="cell"><b>Associate Id</b></td>
								<td class="cell">${selectcourse.associateId}</td>
							</tr>
							<tr>
								<td class="cell"><b>FrontEnd Course</b></td>
								<td class="cell">
								<c:forEach var="frontendcourse" items="${selectcourse.frontendtrack}">
										${frontendcourse}<br/>
									</c:forEach></td>
							</tr>
							<tr>
								<td class="cell"><b>BackEnd Course</b></td>
								<td class="cell">
								<c:forEach var="backendendcourse" items="${selectcourse.backendtrack}">
										${backendendcourse}<br/>
									</c:forEach></td>
							</tr>
						</table>
					</div>
				</div>

			</div>
		</div>
	</div>
	</div>

	<!--End of website main content-->

	<!--Footer-->


	<footer class="site-footer">
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<p>Contact Address :</p>
				<address>Cognizant Techology Solutions, ICC Tech Tower,
					Pune, India</address>
			</div>
		</div>

		<div class="bottm-footer">
			<div class="col-md-5 foot_div" c>© Copyright O2 Academy Pune
				2017. All rights reserved</div>
			<div class="col-md-7 foot_div">
				<ul class="footer-nav">
					<li><a>Designed by O2 Academy Pune</a></li>
					<li><a>Contact</a></li>
					<li><a>Blog</a></li>
				</ul>
			</div>
		</div>
	</div>
	</footer>
</body>
</html>