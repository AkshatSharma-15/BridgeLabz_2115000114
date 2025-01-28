import java.util.Scanner;

public class NumberChecker5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Method to check if the number is prime
        boolean isPrime = isPrime(number);
        System.out.println("Is Prime: " + isPrime);
        
        // Method to check if the number is a neon number
        boolean isNeon = isNeon(number);
        System.out.println("Is Neon: " + isNeon);
        
        // Method to check if the number is a spy number
        boolean isSpy = isSpy(number);
        System.out.println("Is Spy: " + isSpy);
        
        // Method to check if the number is an automorphic number
        boolean isAutomorphic = isAutomorphic(number);
        System.out.println("Is Automorphic: " + isAutomorphic);
        
        // Method to check if the number is a buzz number
        boolean isBuzz = isBuzz(number);
        System.out.println("Is Buzz: " + isBuzz);
    }

    // Method to check if the number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Prime numbers are greater than 1
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }
        return true; // If no divisors are found, the number is prime
    }

    // Method to check if the number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        // Calculate the sum of the digits of the square of the number
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        return sumOfDigits == number; // If the sum of digits of the square equals the number
    }

    // Method to check if the number is a spy number
    public static boolean isSpy(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        
        // Calculate the sum and product of the digits of the number
        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        
        return sumOfDigits == productOfDigits; // If sum and product are equal
    }

    // Method to check if the number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        
        // Check if the square of the number ends with the number itself
        while (square > 0) {
            if (square % 10 != number % 10) {
                return false; // If any digit doesn't match, it's not automorphic
            }
            square /= 10;
            number /= 10;
        }
        
        return true; // If the square ends with the number itself
    }

    // Method to check if the number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7; // Buzz number if divisible by 7 or ends with 7
    }
}
