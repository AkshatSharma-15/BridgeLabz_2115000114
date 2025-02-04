public class Employee {
    private static String companyName = "Technolyn";
    private static int totalEmployees = 0;
    private final String id;
    
    private String name;
    private String designation;
    
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;  
    }
    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    public void displayEmployeeDetails() {
        if (this instanceof Employee) { 
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
    
    public static void main(String[] args) {
        // Create two employee objects
        Employee employee1 = new Employee("abc", "1234E", "Software Engineer");
        Employee employee2 = new Employee("xyz", "3456F", "Software Analyst");
        
        System.out.println("Company Name: " + companyName);
        Employee.displayTotalEmployees();
        
        // Display employee details
        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();    
    }
}
