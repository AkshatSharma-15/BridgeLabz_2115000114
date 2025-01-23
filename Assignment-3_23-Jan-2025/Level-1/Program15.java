import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking inputs from the user.
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        // Implementing logic.
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long factorial = 1;
            
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            System.out.println("The factorial of " + number + " is " + factorial + ".");
        }
    }
}
