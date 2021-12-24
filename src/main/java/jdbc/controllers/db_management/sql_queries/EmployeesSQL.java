package jdbc.controllers.db_management.sql_queries;

import jdbc.config.Config;

public interface EmployeesSQL {
    String ADD_EMPLOYEE = "INSERT INTO employees (employeeID, first_name, last_name) VALUES (?, ?, ?)";
    String GET_ALL_EMPLOYEES = "SELECT * FROM employees";
}
