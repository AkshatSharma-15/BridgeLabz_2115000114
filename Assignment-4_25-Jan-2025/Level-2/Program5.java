import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            count++;  
            tempNumber /= 10;  
        }

        int[] digits = new int[count];
        tempNumber = number;

        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;  
            tempNumber /= 10;  
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
