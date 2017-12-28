<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

    <link href="resources/css/stylish-portfolio.css" rel="stylesheet">
    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/js/main.js"></script>
    <link href="resources/css/main.css" rel="stylesheet">
    <link href="resources/vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
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
        <h1>O<sub>2</sub>  Academy</h1>
        <h3>Learn Almost Anything !!!</h3>
    </div>
	<a href="signout"><button class="log_out" type="submit" id="sub">Sign Out</button></a>
    <!--Web content-->
    <div class="container">
        <div class="row">
            <div class="col-sm-4">
            </div>

            <div class="row">
                <div class="col-sm-4">
					
					<a href="viewMprofile"><button type="submit" class="widget1" id="sub1">View Profile</button></a>
                   	<a href="viewMprofile"><button type="submit" class="widget1" id="sub1">View Associates</button></a>
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
                <address>
                    Cognizant Techology Solutions,
                    ICC Tech Tower, Pune, India
                </address>
            </div>
        </div>

        <div class="bottm-footer">
            <div class="col-md-5 foot_div" c>© Copyright O2 Academy Pune 2017. All rights reserved</div>
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