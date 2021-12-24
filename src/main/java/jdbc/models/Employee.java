package jdbc.models;

public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;

    public Employee(int employeeID, String firstName, String lasName) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lasName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
