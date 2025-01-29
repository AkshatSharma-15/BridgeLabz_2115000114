import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        int number = getInput("Enter a number to calculate its factorial: ");
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }

    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
