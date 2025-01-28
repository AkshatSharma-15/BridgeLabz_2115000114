import java.util.Scanner;

public class NumberChecker6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Method to find factors of the number
        int[] factors = findFactors(number);
        System.out.print("Factors of the number: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        // Method to find the greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor: " + greatestFactor);
        
        // Method to find the sum of the factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of factors: " + sumOfFactors);
        
        // Method to find the product of the factors
        int productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);
        
        // Method to find the product of cube of the factors
        double productOfCubes = findProductOfCubes(factors);
        System.out.println("Product of cubes of factors: " + productOfCubes);
        
        // Method to check if the number is a perfect number
        boolean isPerfect = isPerfectNumber(sumOfFactors, number);
        System.out.println("Is Perfect Number: " + isPerfect);
        
        // Method to check if the number is an abundant number
        boolean isAbundant = isAbundantNumber(sumOfFactors, number);
        System.out.println("Is Abundant Number: " + isAbundant);
        
        // Method to check if the number is a deficient number
        boolean isDeficient = isDeficientNumber(sumOfFactors, number);
        System.out.println("Is Deficient Number: " + isDeficient);
        
        // Method to check if the number is a strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);
    }

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        
        return factors;
    }

    // Method to find the greatest factor using the factors array
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];  // The largest factor is the last element in the sorted array
    }

    // Method to find the sum of the factors using the factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double findProductOfCubes(int[] factors) {
        double productOfCubes = 1;
        for (int factor : factors) {
            productOfCubes *= Math.pow(factor, 3);
        }
        return productOfCubes;
    }

    // Method to check if the number is a perfect number
    public static boolean isPerfectNumber(int sumOfFactors, int number) {
        return sumOfFactors - number == number;  // Proper divisors sum equals the number itself
    }

    // Method to check if the number is an abundant number
    public static boolean isAbundantNumber(int sumOfFactors, int number) {
        return sumOfFactors - number > number;  // Proper divisors sum is greater than the number
    }

    // Method to check if the number is a deficient number
    public static boolean isDeficientNumber(int sumOfFactors, int number) {
        return sumOfFactors - number < number;  // Proper divisors sum is less than the number
    }

    // Method to check if the number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;
        
        while (number != 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }
        
        return sumOfFactorials == originalNumber;  // Sum of factorials of digits equals the number itself
    }

    // Method to calculate the factorial of a number
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
