package jdbc.controllers.db_management;

import jdbc.controllers.db_management.sql_queries.EmployeesSQL;
import jdbc.models.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class EmployeeDAO {


    public static void addEmployeePureSQL(int employeeId, String firstName, String lastName) {
        Employee employee = new Employee(employeeId, firstName, lastName);
        try {
            Connection connection = ConnectionManager.dbCompanyXConnection();

            connection.createStatement().execute("INSERT INTO employees VALUES (" +
                    employee.getEmployeeID()  + ", " +  "\"" + employee.getFirstName() +  "\"" + ", " +  "\"" + employee.getLastName() +  "\"" + ")");

            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addEmployeePreparedStatement(int employeeId, String firstName, String lastName) {
        try {
            PreparedStatement employeePreparedStatement = ConnectionManager.dbCompanyXConnection().prepareStatement(EmployeesSQL.ADD_EMPLOYEE);
            employeePreparedStatement.setInt(1, employeeId);
           // employeePreparedStatement.setDate(2, LocalDate);
            employeePreparedStatement.setString(3, lastName);
            employeePreparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getAllEmployees() {
        try {
            ResultSet resultSet = ConnectionManager.dbCompanyXConnection().createStatement().executeQuery(EmployeesSQL.GET_ALL_EMPLOYEES);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        addEmployeePreparedStatement(2, "John", "Doe");
        getAllEmployees();
    }
}
