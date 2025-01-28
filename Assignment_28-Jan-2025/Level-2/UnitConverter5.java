import java.util.Scanner;

public class UnitConverter5 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;  // Conversion formula
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;  // Conversion formula
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;  // Conversion factor
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;  // Conversion factor
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;  // Conversion factor
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;  // Conversion factor
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user.
        System.out.println("Choose a conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        double value, result;

        // Perform the chosen conversion
        switch (choice) {
            case 1: // Fahrenheit to Celsius
                System.out.print("Enter value in Fahrenheit: ");
                value = scanner.nextDouble();
                result = convertFahrenheitToCelsius(value);
                System.out.println(value + " Fahrenheit is " + result + " Celsius.");
                break;
            case 2: // Celsius to Fahrenheit
                System.out.print("Enter value in Celsius: ");
                value = scanner.nextDouble();
                result = convertCelsiusToFahrenheit(value);
                System.out.println(value + " Celsius is " + result + " Fahrenheit.");
                break;
            case 3: // Pounds to Kilograms
                System.out.print("Enter value in pounds: ");
                value = scanner.nextDouble();
                result = convertPoundsToKilograms(value);
                System.out.println(value + " pounds is " + result + " kilograms.");
                break;
            case 4: // Kilograms to Pounds
                System.out.print("Enter value in kilograms: ");
                value = scanner.nextDouble();
                result = convertKilogramsToPounds(value);
                System.out.println(value + " kilograms is " + result + " pounds.");
                break;
            case 5: // Gallons to Liters
                System.out.print("Enter value in gallons: ");
                value = scanner.nextDouble();
                result = convertGallonsToLiters(value);
                System.out.println(value + " gallons is " + result + " liters.");
                break;
            case 6: // Liters to Gallons
                System.out.print("Enter value in liters: ");
                value = scanner.nextDouble();
                result = convertLitersToGallons(value);
                System.out.println(value + " liters is " + result + " gallons.");
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 6.");
                break;
        }
    }
}
