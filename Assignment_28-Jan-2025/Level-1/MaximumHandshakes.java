import java.util.Scanner;

public class MaximumHandshakes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of students as input from the user.
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculating maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);
    }
}
