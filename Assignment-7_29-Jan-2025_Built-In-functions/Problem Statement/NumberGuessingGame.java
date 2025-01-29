import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        
        // Calling game function.
        playGame(scanner);
    }

    public static void playGame(Scanner scanner) {
        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String feedback;
        
        while (true) {
            guess = generateGuess(lowerBound, upperBound);
            System.out.println("My guess is: " + guess);
            
            System.out.print("Is the guess correct (y/n)? ");
            feedback = scanner.nextLine().toLowerCase();
            
            if (feedback.equals("y")) {
                System.out.println("Hooray! I guessed your number!");
                break;
            } else {
                System.out.print("Is my guess too high or too low (h/l)? ");
                feedback = scanner.nextLine().toLowerCase();
                
                if (feedback.equals("h")) {
                    upperBound = guess - 1;
                } else if (feedback.equals("l")) {
                    lowerBound = guess + 1;
                } else {
                    System.out.println("Invalid input! Please enter 'h' for high or 'l' for low.");
                }
            }
        }
    }

    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
