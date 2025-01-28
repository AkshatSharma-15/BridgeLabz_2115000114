import java.util.Scanner;

public class NumberChecker4 {

    public static void main(String[] args) {
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
        
        // Method to reverse the digits array
        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        // Method to check if the number is a palindrome
        boolean isPalindrome = isPalindrome(digits, reversedDigits);
        System.out.println("Is Palindrome: " + isPalindrome);
        
        // Method to check if the number is a Duck number
        boolean isDuckNumber = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuckNumber);
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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        int j = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            reversedDigits[j++] = digits[i];
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits, int[] reversedDigits) {
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if the number is a Duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;  // Duck number has at least one non-zero digit
            }
        }
        return false;  // If all digits are zero, it's not a Duck number
    }
}
