import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = getInput("Enter a string to check if it's a palindrome: ");
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }

    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll(" ", "").toLowerCase(); // Removing spaces and converting to lowercase
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }

    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
