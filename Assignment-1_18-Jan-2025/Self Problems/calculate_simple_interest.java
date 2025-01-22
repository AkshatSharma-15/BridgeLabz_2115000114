import java.util.Scanner;

public class calculate_simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal amount: ");
        double p = sc.nextDouble();

        System.out.println("Enter Rate of interest: ");
        double r = sc.nextDouble();

        System.out.println("Enter time of investment: ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;

        System.out.println("Simple interest is: " + si);
    }
}