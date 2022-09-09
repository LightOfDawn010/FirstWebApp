<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>User Workspace</title>
    </head>
    <body>
        <center>
            <h1>Hello <%=request.getAttribute("nickname")%> and Welcome to Your Cabinet </h1>
            <br><br>
            <a href="index.jsp">Sign Out</a>
        </center>
    </body>
</html>