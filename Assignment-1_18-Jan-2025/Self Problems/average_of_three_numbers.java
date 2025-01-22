import java.util.Scanner;

public class average_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter third number: ");
        double num3 = sc.nextDouble();

        double ans = (num1 + num2 + num3) / 3;

        System.out.println("Their average is: " + ans);
    }
}
