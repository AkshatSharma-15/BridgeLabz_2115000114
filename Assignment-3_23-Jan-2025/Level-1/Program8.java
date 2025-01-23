import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();

        // Implementing logic.
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
