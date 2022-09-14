package com.example.firstwebapp;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "RegistrationServlet", value = "/registration-servlet")
public class UserClassDao extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {

        String uname = request.getParameter("username");
        String upwd = request.getParameter("password");
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String uemail = request.getParameter("email");
        String prof = request.getParameter("profession");
        RequestDispatcher dispatcher = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc://mysql:localhost:3306/db","root","mrjuice123");
            PreparedStatement pst = con.prepareStatement("insert into users(uname,upwd,fname,lname,uemail,prof)" +
                    "values (?,?,?,?,?,?)");
            pst.setString(1,uname);
            pst.setString(2,upwd);
            pst.setString(3,fname);
            pst.setString(4,lname);
            pst.setString(5,uemail);
            pst.setString(6,prof);

            int rowCount = pst.executeUpdate();
            dispatcher = request.getRequestDispatcher("Registration.jsp");
            if (rowCount > 0) {
                request.setAttribute("status", "success");
            } else {
                request.setAttribute("status","failed");
            }
            dispatcher.forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
