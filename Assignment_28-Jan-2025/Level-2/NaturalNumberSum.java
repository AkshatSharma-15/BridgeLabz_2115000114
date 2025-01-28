import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;   
        }
        return n + sumUsingRecursion(n - 1);  
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking natural number n as input from the user.
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the input is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;  // Exit if the input is not a valid natural number
        }

        // Calculate sum using recursion
        int recursiveSum = sumUsingRecursion(n);

        // Calculate sum using the formula
        int formulaSum = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Verify if both results are correct
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the correct result.");
        } else {
            System.out.println("There is an error in the results.");
        }
    }
}
