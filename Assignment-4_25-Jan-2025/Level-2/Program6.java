import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.println("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Initialising arrays.
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        // Taking inputs from the user.
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();

            System.out.println("Enter weight (in kilograms) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
        }

        // Implementing logic.
        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("Results:");
        System.out.println("Person\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.println((i + 1) + "\t" + heights[i] + "\t\t" + weights[i] + "\t\t" + bmis[i] + "\t" + statuses[i]);
        }
    }
}
