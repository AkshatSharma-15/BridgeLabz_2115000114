import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user.
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter the employee's years of service: ");
        int years = sc.nextInt();
        
        // Implementing logic.
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("The employee's bonus is: $" + bonus);
        } else {
            System.out.println("The employee does not qualify for a bonus.");
        }
    }
}
