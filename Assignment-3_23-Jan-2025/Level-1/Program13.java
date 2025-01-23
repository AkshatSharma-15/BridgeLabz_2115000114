import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from the user.
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;

            int Sum = 0;
            for (int i = 1; i <= n; i++) {
                Sum += i;
            }

            // Print both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + Sum);

            // Verify if the results match
            if (formulaSum == Sum) {
                System.out.println("The results match. Both computations are correct.");
            } else {
                System.out.println("The results do not match. There is an error in the computations.");
            }
        } else {
            System.out.println("The number entered is not a natural number.");
        }
    }
}
