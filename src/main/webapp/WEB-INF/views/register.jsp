<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

	 <link href="resources/css/stylish-portfolio.css" rel="stylesheet">
	 
</head>
<body>

	<div class="wrapper">

<h2>Register </h2>

<form>
  

  <div class="container">
    <label><b>Name</b></label>
    <input type="text" placeholder="Enter Username" name="name" required>

    <label><b>Associate Id</b></label>
    <input type="Tel" placeholder="Enter Id" name="Id" required>

    <label><b>Role</b></label>
    
 <select name="Role">
    <option value="Id">Associate</option>
    <option value="men">Mentor</option>
    <option value="Sup">Supervisor</option>s
  </select>

  <br>

    <label><b>Email Id</b></label>
    <input type="Email" placeholder="Email Id" name="Email" required>

    <label><b>Select Username</b></label>
    <input type="text" placeholder="Enter name" name="uname" required>

    <label><b>Select Password</b></label>
    <input type="password" placeholder="Select Password" name="password" required>

    <label><b>Confirm Password</b></label>
    <input type="password" placeholder="Confirm Password" name="Password" required>
        

        
    <button type="submit">Sign Up</button>
    
  </div>

  

  
</form>
</div>>
</body>
</html>