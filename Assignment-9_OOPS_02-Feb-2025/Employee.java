public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String title;

    public Manager(int employeeID, String department, double salary, String title) {
        super(employeeID, department, salary);
        this.title = title;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);  // Accessing public field from superclass
        System.out.println("Department: " + department);  // Accessing protected field from superclass
        System.out.println("Title: " + title);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(110, "Sales", 89000.0);
        employee.displayEmployeeDetails();

        Manager manager = new Manager(103, "Sales", 56000.0, "Sales Manager");
        manager.displayManagerDetails();

        // Modifying salary using the public method
        employee.setSalary(55000.0);
        System.out.println("Updated Salary: $" + employee.getSalary());
    }
}