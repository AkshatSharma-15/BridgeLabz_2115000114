import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining arrays.
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Initialising and defining variables.
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Taking inputs from the user and implementing logic.
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter the salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();

                if (salary[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive number.");
                    continue;
                }

                System.out.print("Enter the years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextInt();

                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                    continue;
                }

                break;  
            }
        }

        // Implementing logic.
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;  
            } else {
                bonus[i] = salary[i] * 0.02;  
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout: $" + totalBonus);
        System.out.println("Total Old Salary of all employees: $" + totalOldSalary);
        System.out.println("Total New Salary (including bonus) of all employees: $" + totalNewSalary);

        System.out.println("Employee Bonus Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Salary = $" + salary[i] +
                               ", Years of Service = " + yearsOfService[i] +
                               ", Bonus = $" + bonus[i] +
                               ", New Salary = $" + newSalary[i]);
        }
    }
}
