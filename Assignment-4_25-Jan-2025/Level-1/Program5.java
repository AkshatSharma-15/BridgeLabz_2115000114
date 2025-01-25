import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from the user.
        System.out.print("Enter a number (6-9) for the multiplication table: ");
        int number = sc.nextInt();

        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
        } else {
            int[] multiplicationResult = new int[10];

            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = number * i;  // Store the result in the array
            }

            System.out.println("Multiplication table of " + number + ":");
            for (int i = 0; i < multiplicationResult.length; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
            }
        }
    }
}
