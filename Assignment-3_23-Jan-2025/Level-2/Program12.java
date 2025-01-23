import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {  
                System.out.println(i);
            }
        }
    }
}
