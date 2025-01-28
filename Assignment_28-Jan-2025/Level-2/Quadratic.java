import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        
        // Calculate the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        
        // Check the nature of the discriminant
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The roots are real and identical.");
            System.out.println("Root: " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and imaginary.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
