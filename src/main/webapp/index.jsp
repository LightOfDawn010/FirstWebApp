<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Sign In</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700;800;900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.3.1/css/all.min.css">
    <link rel="stylesheet" href="Style.css">
  </head>
  <body>
  <center>
    <form action="hello-servlet" >
      <label for="email">e-mail:</label><br>
      <input type="text" id="email" name="email" required ><br>
      <label for="lname">Password:</label><br>
      <input type="password" id="lname" name="lname" required ><br><br>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label><br>
      <button class="buttonA">Submit</button>
    </form>
    <br>
    <a href="Registration.jsp"> Register </a>
    </center>
  </body>
</html>