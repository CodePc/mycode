package com;

import java.sql.*;

public class JDBCConnectionClass {
    static {
        try {
            Class.forName("driverClassName");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:h2:~/test";   //database specific url.
        String user = "sa";
        String password = "";
        try {
            Connection connection =
                    DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("driverClassName");
        String url = "jdbc:h2:~/test";   //database specific url.
        String user = "sa";
        String password = "";
        Connection connection =
                DriverManager.getConnection(url, user, password);
    }

    public void query() throws ClassNotFoundException, SQLException {
        Class.forName("driverClassName");
        String url = "jdbc:h2:~/test";   //database specific url.
        String user = "sa";
        String password = "";
        Connection connection =
                DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql = "select * from people";
        ResultSet result = statement.executeQuery(sql);
        /**
         * When you execute an SQL query you get back a ResultSet. The ResultSet contains the result of your SQL query.
         * The result is returned in rows with columns of data. You iterate the rows of the ResultSet like this:**/
        while (result.next()) {

            String name = result.getString("name");
            long age = result.getLong("age");

        }

        result.getString("columnName");
        result.getLong("columnName");
        result.getInt("columnName");
        result.getDouble("columnName");
        result.getBigDecimal("columnName");

        result.getString(1);
        result.getLong(2);
        result.getInt(3);
        result.getDouble(4);
        result.getBigDecimal(5);

    }


//    public void jdbcFullCode() throws ClassNotFoundException, SQLException {
//        Class.forName("driverClassName");
//        String url = "jdbc:h2:~/test";   //database specific url.
//        String user = "sa";
//        String password = "";
//        Connection connection =
//                DriverManager.getConnection(url, user, password);
//        Statement statement = connection.createStatement();
//
//        String sql = "select * from people";
//
//        ResultSet result = statement.executeQuery(sql);
//
//        while (result.next()) {
//
//            String name = result.getString("name");
//            long age = result.getLong("age");
//
//            System.out.println(name);
//            System.out.println(age);
//        }
//
//        result.close();
//        statement.close();
//    }
//
//    Statement statement = null;
//
//try
//
//    {
//        statement = connection.createStatement();
//        ResultSet result = null;
//        try {
//            String sql = "select * from people";
//            ResultSet result = statement.executeQuery(sql);
//
//            while (result.next()) {
//
//                String name = result.getString("name");
//                long age = result.getLong("age");
//
//                System.out.println(name);
//                System.out.println(age);
//            }
//        } finally {
//            if (result != null) result.close();
//        }
//    } finally
//
//    {
//        if (statement != null) statement.close();
//    }
//
//
//}
}