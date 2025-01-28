import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking angle in degrees as input from the user.
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
