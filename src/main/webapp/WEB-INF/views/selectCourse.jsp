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
        <form:form action="#">
            <input type="checkbox" name="course_1" value="course 1"><a href="https://www.w3schools.com/html/default.asp">HTML</a><br>
            <input type="checkbox" name="course_2" value="course 2"><a href="https://www.w3schools.com/css/default.asp">CSS</a><br>
            <input type="checkbox" name="course_3" value="course 3"><a href="https://www.w3schools.com/bootstrap/default.asp">Bootstrap</a><br>
            <input type="checkbox" name="course_4" value="course 4"><a href="https://www.w3schools.com/js/default.asp">JavaScript</a><br>
            <input type="checkbox" name="course_5" value="course 5"><a href="https://www.w3schools.com/angular/default.asp">AngularJS</a><br><br><br>

        <!--List of Back End Courses-->
        <h4>Back End Tracks</h4>
        <input type="checkbox" name="course_6" value="course 6"><a href="https://www.tutorialspoint.com/mongodb/">MongoDB</a><br>
        <input type="checkbox" name="course_7" value="course 7"><a href="https://www.tutorialspoint.com/mysql/">MY SQL</a><br>
        <input type="checkbox" name="course_8" value="course 8"><a href="https://www.tutorialspoint.com/spring/spring_web_mvc_framework.htm">Spring MVC</a><br>
        <input type="checkbox" name="course_7" value="course 7"><a href="https://www.tutorialspoint.com/servlets/">Servlets</a><br>
        <input type="checkbox" name="course_8" value="course 8"><a href="https://www.tutorialspoint.com/drupal/">Drupal</a><br>
        </form:form>

        <button type="submit" id="submit">Submit</button>
    </div>
</div>
</body>
</html>