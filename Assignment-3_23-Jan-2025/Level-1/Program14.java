import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Implementing logic.
        if (number >= 0) {
            long factorial = 1;

            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
