import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialising variables.
        double total = 0.0;
        double userInput;

        // Taking input from the user.
        System.out.print("Enter a number (0 to stop): ");
        userInput = sc.nextDouble();

        // Implementing logic.
        while (userInput != 0) {
            total += userInput;
            System.out.print("Enter a number (0 to stop): ");
            userInput = sc.nextDouble();
        }

        System.out.println("The total sum is: " + total);
    }
}
