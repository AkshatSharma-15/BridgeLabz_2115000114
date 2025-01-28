import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int n) {
        if (n < 2) {
            return 0; 
        }
        return (n * (n - 1)) / 2; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = calculateHandshakes(n);

        System.out.println("The maximum number of handshakes among " + n + " students is " + maxHandshakes);
    }
}
