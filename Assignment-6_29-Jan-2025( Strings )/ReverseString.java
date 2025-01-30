import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user as string.
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversedString = reverseString(input);

        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}
