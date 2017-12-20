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

</head>
<body>

<div class="wrapper">
    <div class="container">
        <h2>Course Catalogue</h2>

        <!-- List of Front End Courses-->
        <h4>Front End Tracks</h4>
        <form:form modelAttribute="selectcourse" action="nexttoselectcourse">
            <form:checkbox path="frontendtrack" name="course_1" value="HTML"/><a href="https://www.w3schools.com/html/default.asp">HTML</a><br>
            <form:checkbox path="frontendtrack" name="course_2" value="CSS"/><a href="https://www.w3schools.com/css/default.asp">CSS</a><br>
            <form:checkbox path="frontendtrack" name="course_3" value="Bootstrap"/><a href="https://www.w3schools.com/bootstrap/default.asp">Bootstrap</a><br>
            <form:checkbox path="frontendtrack" name="course_4" value="JavaScript"/><a href="https://www.w3schools.com/js/default.asp">JavaScript</a><br>
            <form:checkbox path="frontendtrack" name="course_5" value="AngularJS"/><a href="https://www.w3schools.com/angular/default.asp">AngularJS</a><br><br><br>

        <!--List of Back End Courses-->
        <h4>Back End Tracks</h4>
        <form:checkbox path="backendtrack" name="course_6" value="MongoDB"/><a href="https://www.tutorialspoint.com/mongodb/">MongoDB</a><br>
        <form:checkbox path="backendtrack" name="course_7" value="MYSQL"/><a href="https://www.tutorialspoint.com/mysql/">MY SQL</a><br>
        <form:checkbox path="backendtrack" name="course_8" value="SpringMVC"/><a href="https://www.tutorialspoint.com/spring/spring_web_mvc_framework.htm">Spring MVC</a><br>
        <form:checkbox path="backendtrack" name="course_7" value="Servlets"/><a href="https://www.tutorialspoint.com/servlets/">Servlets</a><br>
        <form:checkbox path="backendtrack" name="course_8" value="Drupal"/><a href="https://www.tutorialspoint.com/drupal/">Drupal</a><br>
        <button type="submit" id="submit">Submit</button>
        </form:form>
    </div>   
</div>
</body>
</html>