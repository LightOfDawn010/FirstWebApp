<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Create New Account</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700;800;900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.3.1/css/all.min.css">
    <link rel="stylesheet" href="Style.css">
  </head>
  <body>
  <center>
  <h2> Your Password does not match Please Enter Again </h2>
  </center>
    <form action="registration-servlet" >
      <center>
        <label for="firstname">First Name:</label><br>
        <input type="text" id="firstname" name="firstname" placeholder="Enter your Name" required ><br>
        <label for="lastname">Last Name:</label><br>
        <input type="text" id="lastname" name="lastname" placeholder="Enter your Last name" required ><br>
        <label for="profession">Profession:</label><br>
        <input type="text" id="profession" name="profession" placeholder="Enter your Profession" required ><br>
        <label for="email">e-mail:</label><br>
        <input type="text" id="email" name="email" placeholder="Enter your e-mail" required ><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required placeholder="Enter your password" ><br>
        <label for="repeat-password">Repeat Password:</label><br>
        <input type="password" id="repeat-password" name="repeat-password" placeholder="Repeat your password" required ><br><br>
        <button class="buttonB">Register</button>
        </div>
        <div class="container signin">
          <p>Already have an account? <a href="index.jsp">Sign in</a>.</p>
        </div>
      </center>

    </form>

  </body>

</html>