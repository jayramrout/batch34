package jrout.tutorial.jdbc;
// import related package
//import com.mysql.cj.jdbc.Driver;

import jrout.tutorial.jdbc.domain.Employee;

import java.sql.*;

public class JdbcProgram {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        // load the driver.
        try {
            /*Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            */

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // get the connection
        // databaseUrl , username , password
        String databaseURL = "jdbc:mysql://localhost:32768/employees";
//        String databaseURL = "jdbc:oracle:thin:@localhost:32768/SID";
        try {
            connection = DriverManager.getConnection(databaseURL, "root", "root");
            System.out.println("Connection established...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // execute the query.
        try {
            /*
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from employees where last_name = 'Facello' and gender = 'M'");
            */
            preparedStatement = connection.prepareStatement("select * from employees where last_name = ? and gender = ?");
            preparedStatement.setString(1,"Facello");
            preparedStatement.setString(2,"M");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println( resultSet.getString("emp_no") +" "+ resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        // close the connection
    }
}
