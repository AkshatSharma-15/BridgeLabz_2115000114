import java.util.Scanner;

public class NumberChecker {

    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check if the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers and return 1 if number1 > number2, 0 if equal, and -1 if number1 < number2
    public static int compareNumbers(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Loop through the array to check each number
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            System.out.print("Number " + (i + 1) + " is " + positivity + ". ");
            if (positivity.equals("Positive")) {
                String evenOdd = isEven(numbers[i]);
                System.out.println("It is " + evenOdd + ".");
            } else {
                System.out.println();
            }
        }

        // Comparing the first and last numbers
        int comparisonResult = compareNumbers(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
    }
}
