import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers.
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the sum.
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of natural numbers as input from the user.
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculating the sum of n natural numbers.
            int sum = calculateSum(n);

            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}
