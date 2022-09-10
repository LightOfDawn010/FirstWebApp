package com.example.firstwebapp;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "registrationServlet", value = "/registration-servlet")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pass = req.getParameter("password");
        String repeat = req.getParameter("repeat-password");
        if (pass.equals(repeat)){
            String name = req.getParameter("firstname");
            String lastn = req.getParameter("lastname");
            req.setAttribute("nickname", name + " " + lastn);
            RequestDispatcher dispatcher = req.getRequestDispatcher("Wb.jsp");
            dispatcher.forward(req, resp);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("passwordErrorPage.jsp");
            dispatcher.forward(req, resp);

        }

    }
}