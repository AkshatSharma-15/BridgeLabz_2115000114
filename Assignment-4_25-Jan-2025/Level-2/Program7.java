import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.println("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        // Taking inputs from the user.
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter height (in meters) for person " + (i + 1) + ": ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.println("Height must be positive. Please enter again: ");
                height = sc.nextDouble();
            }
            personData[i][0] = height;

            System.out.println("Enter weight (in kilograms) for person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.println("Weight must be positive. Please enter again: ");
                weight = sc.nextDouble();
            }
            personData[i][1] = weight;

            personData[i][2] = weight / (height * height);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("Results:");
        System.out.println("Person\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.println((i + 1) + "\t" + personData[i][0] + "\t\t" + personData[i][1] + "\t\t" + personData[i][2] + "\t" + weightStatus[i]);
        }
    }
}
