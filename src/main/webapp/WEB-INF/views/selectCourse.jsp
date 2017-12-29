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

    <!--Navigation Bar-->
    <nav>
        <ul>
            <li><a href="showcourse">My Courses</a></li>
            <li><a href="dashbordotherthanlogin">Dashboard</a></li>
        </ul>
    </nav>

    <!--Log out-->
    <a href="signout"><button class="log_out" type="submit" id="sub">Sign Out</button></a>



    <!--web content-->
    <div class="container">
        <div class="row">
            <div class="col-sm-4">
            </div>

            <div class="wrapper">
        <h2>Course Catalogue</h2>

        <!-- List of Front End Courses-->
        <h4>Front End Courses</h4>
        <form:form modelAttribute="selectcourse" action="nexttoselectcourse">
            <form:checkbox path="frontendtrack" name="course_1" value="HTML"/>HTML<br>
            <form:checkbox path="frontendtrack" name="course_2" value="CSS"/>CSS<br>
            <form:checkbox path="frontendtrack" name="course_3" value="Bootstrap"/>Bootstrap<br>
            <form:checkbox path="frontendtrack" name="course_4" value="JavaScript"/>JavaScript<br>
            <form:checkbox path="frontendtrack" name="course_5" value="AngularJS"/>AngularJS<br><br><br>

        <!--List of Back End Courses-->
        <h4>Back End Courses</h4>
        <form:checkbox path="backendtrack" name="course_6" value="MongoDB"/>MongoDB<br>
        <form:checkbox path="backendtrack" name="course_7" value="MYSQL"/>MY SQL<br>
        <form:checkbox path="backendtrack" name="course_8" value="SpringMVC"/>Spring MVC<br>
        <form:checkbox path="backendtrack" name="course_7" value="Servlets"/>Servlets<br>
        <form:checkbox path="backendtrack" name="course_8" value="Drupal"/>Drupal<br>
        <button class="submit_Btn" type="submit" id="submit">Submit</button>
        </form:form>
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