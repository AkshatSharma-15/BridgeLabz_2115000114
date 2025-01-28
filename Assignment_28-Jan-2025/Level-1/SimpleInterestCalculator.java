import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from the user.
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = sc.nextDouble();

        // Calculating simple interest.
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Output the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%%, and Time %.2f years.%n", 
                          simpleInterest, principal, rate, time);
    }
}
