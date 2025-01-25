import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;  
        }

        String[] fizzBuzzArray = new String[number + 1];

        // Implementing logic.
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";  
            } else if (i % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";  
            } else if (i % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";  
            } else {
                fizzBuzzArray[i] = String.valueOf(i);  
            }
        }

        System.out.println("FizzBuzz Results:");
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzArray[i]);
        }
    }
}
