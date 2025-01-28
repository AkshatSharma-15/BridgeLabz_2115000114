import java.util.Scanner;

public class NumberChecker2 {

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
        
        // Method to check if it's a Duck Number
        boolean isDuckNumber = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuckNumber);
        
        // Method to check if it's an Armstrong Number
        boolean isArmstrong = isArmstrongNumber(digits, digitCount);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        
        // Method to find the largest and second largest digits
        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestTwo[0]);
        System.out.println("Second largest digit: " + largestTwo[1]);
        
        // Method to find the smallest and second smallest digits
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestTwo[0]);
        System.out.println("Second smallest digit: " + smallestTwo[1]);
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

    // Method to check if the number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong Number
    public static boolean isArmstrongNumber(int[] digits, int digitCount) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digitCount);
        }
        int originalNumber = 0;
        for (int i = 0; i < digits.length; i++) {
            originalNumber = originalNumber * 10 + digits[i];
        }
        return sum == originalNumber;
    }

    // Method to find the largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[] { largest, secondLargest };
    }

    // Method to find the smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[] { smallest, secondSmallest };
    }
}
