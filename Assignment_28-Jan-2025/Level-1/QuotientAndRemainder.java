import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Calculate quotient
        int remainder = number % divisor; // Calculate remainder
        return new int[]{quotient, remainder}; // Return both as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two numbers as input from the user.
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Handling division by zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero. Please try again.");
        } else {
            // Find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }
    }
}
