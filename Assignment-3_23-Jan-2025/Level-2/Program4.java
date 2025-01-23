import java.util.Scanner;;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking inputs from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; 
                    break; 
                }
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
