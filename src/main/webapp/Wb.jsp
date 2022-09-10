<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>User Workspace</title>
    </head>
    <body>
        <center>
            <h1>Hello <%=request.getAttribute("nickname")%> and Welcome to Your Cabinet </h1>
            <br><br>
            <style>
                body {
                    background-image: url('https://images.pexels.com/photos/667838/pexels-photo-667838.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1');
                    background-repeat: no-repeat;
                    background-size: cover;
                }
            </style>
        </center>
        <div style="float:right">
            <form align="right" name="form1" method="post" action="index.jsp">
                <label class=".logoutButton">
                    <input name="submit2" type="submit" id="submit2" value="log out">
                </label>
            </form>
        </div>
    </body>
</html>