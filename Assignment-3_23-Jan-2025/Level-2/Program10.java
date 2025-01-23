import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking inputs from the user.
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        
        int result = 1;

        // Implementing logic.
        for (int i = 1; i <= power; i++) {
            result *= number;  
        }
        
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
