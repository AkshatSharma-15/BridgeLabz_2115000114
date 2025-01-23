import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Implementing logic.
        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;

            int Sum = 0;
            int counter = 1;
            while (counter <= n) {
                Sum += counter;
                counter++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + Sum);

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
