import java.util.Scanner;

public class FactorCalculator {

    // Method to find the factors of the number and return them in an array
    public static int[] findFactors(int number) {
        // First, find the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Second, fill the array with the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of the squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number for which factors will be found as input from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);

        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display sum, product, and sum of squares of factors
        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        double sumOfSquares = sumOfSquaresOfFactors(factors);

        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}
