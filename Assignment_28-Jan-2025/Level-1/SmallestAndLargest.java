import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3)); // Find the smallest
        int largest = Math.max(number1, Math.max(number2, number3));  // Find the largest

        return new int[]{smallest, largest}; // Return both as an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking three numbers as input from the user.
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Finding the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
    }
}
