import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from the user.
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();

        // Implementing logic.
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
