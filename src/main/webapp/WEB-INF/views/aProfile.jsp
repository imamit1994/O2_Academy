<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <%@ page isELIgnored="false" %>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>MentorProfile</title>

    <!-- Custom CSS -->
    <link href="/resources/css/stylish-portfolio.css" rel="stylesheet">
    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/js/main.js"></script>
    <link href="resources/css/main.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>

<body>
<div class="wrapper">
    <h2>Profile</h2>
    <div class="container">
        <form:form modelAttribute="userInfo" action="usersave"  id="form">
        <div>
            <table class="table ">
                <tr>
                    <td class="cell"><b>Name</b></td>
                    <td class="cell">${userInfo.name}</td>
                </tr>
                <tr>
                    <td class="cell"><b>Associate Id</b></td>
                    <td class="cell">${userInfo.associateId}</td>
                </tr>
                <tr>
                    <td class="cell"><b>Role</b></td>
                    <td class="cell">${userInfo.role} </td>
                </tr>
                <tr>
                    <td class="cell"><b>Email Id</b></td>
                    <td class="cell">${userInfo.emailId}</td>
                </tr>
            </table>
        </div>
        <button type="submit" id="updateDetails" formaction="/register">Update Info</button>
    </div>
    </form:form>
</div>
</div>
</body>
</html>

