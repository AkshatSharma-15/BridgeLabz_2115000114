import java.util.Scanner;

public class UnitConverter12 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;  // Conversion factor
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;  
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;  
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;  
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.println("Choose a conversion type:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        double value, result;

        // Perform the chosen conversion
        switch (choice) {
            case 1: // Kilometers to Miles
                System.out.print("Enter value in kilometers: ");
                value = sc.nextDouble();
                result = convertKmToMiles(value);
                System.out.println(value + " kilometers is " + result + " miles.");
                break;
            case 2: // Miles to Kilometers
                System.out.print("Enter value in miles: ");
                value = sc.nextDouble();
                result = convertMilesToKm(value);
                System.out.println(value + " miles is " + result + " kilometers.");
                break;
            case 3: // Meters to Feet
                System.out.print("Enter value in meters: ");
                value = sc.nextDouble();
                result = convertMetersToFeet(value);
                System.out.println(value + " meters is " + result + " feet.");
                break;
            case 4: // Feet to Meters
                System.out.print("Enter value in feet: ");
                value = sc.nextDouble();
                result = convertFeetToMeters(value);
                System.out.println(value + " feet is " + result + " meters.");
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
                break;
        }
    }
}
