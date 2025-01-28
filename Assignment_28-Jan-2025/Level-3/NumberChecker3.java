import java.util.Scanner;

public class NumberChecker3 {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Method to find the count of digits in the number
        int digitCount = findDigitCount(number);
        System.out.println("Count of digits: " + digitCount);
        
        // Method to store the digits of the number in an array
        int[] digits = storeDigits(number);
        System.out.print("Digits of the number: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        // Method to find the sum of the digits
        int sumOfDigits = findSumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);
        
        // Method to find the sum of the squares of the digits
        double sumOfSquares = findSumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        
        // Method to check if the number is a Harshad number
        boolean isHarshadNumber = isHarshadNumber(sumOfDigits, number);
        System.out.println("Is Harshad number: " + isHarshadNumber);
        
        // Method to find the frequency of each digit
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Frequency of each digit:");
        for (int[] freq : frequency) {
            System.out.println("Digit " + freq[0] + ": " + freq[1]);
        }
    }

    // Method to find the count of digits in the number
    public static int findDigitCount(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int count = findDigitCount(number);
        int[] digits = new int[count];
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of the number
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of the number
    public static double findSumOfSquares(int[] digits) {
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int sumOfDigits, int number) {
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 for digits 0 to 9
        
        // Initialize frequency for each digit to 0
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        
        // Count frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        return frequency;
    }
}
