import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialising variables.
        double total = 0.0;

        while (true) {
            // Taking input from the user.
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = sc.nextDouble();

            // Implementing logic.
            if (userInput <= 0) {
                break;
            }

            total += userInput;
        }

        System.out.println("The total sum is: " + total);

    }
}
