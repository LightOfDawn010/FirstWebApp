package com.example.firstwebapp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet {

    @WebServlet(name = "helloServlet", value = "/hello-servlet")
    public static class HelloServlet extends HttpServlet {

        private UserClassDao userClassDao = new UserClassDao();


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            String rame = request.getParameter("uname");
            request.setAttribute("nickname", rame);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Wb.jsp");
            dispatcher.forward(request, response);
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String eMail = request.getParameter("eMail");
            String password = request.getParameter("password");
            String username = request.getParameter("username");
            String profession = request.getParameter("profession");

            UserClass userClass = new UserClass();
            userClass.setFirstName(firstName);
            userClass.setLastName(lastName);
            userClass.setPassword(password);
            userClass.seteMail(eMail);
            userClass.setUserName(username);
            userClass.setProfession(profession);

            try {
                userClassDao.registerUser(userClass);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            response.sendRedirect("");
        }



    }
}
