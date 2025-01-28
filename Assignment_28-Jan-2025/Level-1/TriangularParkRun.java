import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds required
    public static int calculateRounds(double perimeter, double distanceToRun) {
        return (int) Math.ceil(distanceToRun / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking sides of the triangular park as input
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculating the perimeter
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Converting the target distance (5 km) to meters
        double distanceToRun = 5000;

        // Calculating number of rounds required
        int rounds = calculateRounds(perimeter, distanceToRun);

        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
    }
}
