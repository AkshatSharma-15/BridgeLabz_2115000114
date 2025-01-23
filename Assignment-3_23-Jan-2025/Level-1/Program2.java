import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from the user.
        System.out.println("Enter first number: ");
        double first = sc.nextDouble();

        System.out.println("Enter second number: ");
        double second = sc.nextDouble();

        System.out.println("Enter third number: ");
        double third = sc.nextDouble();

        // Implementing if-else statement.
        if(first < second && first < third)
            System.out.println("Is the first number the smallest? Yes");
        else
            System.out.println("Is the first number the smallest? No");
    }
}
