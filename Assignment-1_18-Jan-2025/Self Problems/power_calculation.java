import java.util.Scanner;
import java.lang.Math;

public class power_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base: ");
        double a = sc.nextDouble();

        System.out.println("Enter exponent: ");
        double b = sc.nextDouble();

        double ans = Math.pow(a, b);
        System.out.println("Output is: " + ans);
    }
}
