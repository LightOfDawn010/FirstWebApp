package com.example.firstwebapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserClassDao {

        public int registerUser(UserClass userClass) throws ClassNotFoundException {
            String INSERT_USERS_SQL = "INSERT INTO UserClass  (Firstname,LastName,eMail,Password,UserName,Profession) VALUES  (?,?, ?, ?, ?, ?);";

            int result = 0;

            Class.forName("com.mysql.jdbc.Driver");

            try (Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "mrjuice123");

                 PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, userClass.getFirstName());
                preparedStatement.setString(3, userClass.getLastName());
                preparedStatement.setString(4, userClass.getUserName());
                preparedStatement.setString(5, userClass.getPassword());
                preparedStatement.setString(6, userClass.geteMail());
                preparedStatement.setString(6, userClass.getProfession());


                System.out.println(preparedStatement);
                result = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                printSQLException(e);
            }
            return result;
        }

        private void printSQLException(SQLException ex) {
            for (Throwable e: ex) {
                if (e instanceof SQLException) {
                    e.printStackTrace(System.err);
                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                    System.err.println("Message: " + e.getMessage());
                    Throwable t = ex.getCause();
                    while (t != null) {
                        System.out.println("Cause: " + t);
                        t = t.getCause();
                    }
                }
            }
        }
    }

