import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[10];

        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);  // Store result of number * (i+1)
        }

        System.out.println("Multiplication table of " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
