import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        int choice = getChoice();
        
        if (choice == 1) {
            double fahrenheit = getTemperature("Enter temperature in Fahrenheit: ");
            double celsius = fahrenheitToCelsius(fahrenheit);
            displayResult(fahrenheit, celsius, "Fahrenheit", "Celsius");
        } else if (choice == 2) {
            double celsius = getTemperature("Enter temperature in Celsius: ");
            double fahrenheit = celsiusToFahrenheit(celsius);
            displayResult(celsius, fahrenheit, "Celsius", "Fahrenheit");
        } else {
            System.out.println("Invalid choice. Please restart the program.");
        }
    }

    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the conversion option:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter 1 or 2: ");
        return scanner.nextInt();
    }

    public static double getTemperature(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void displayResult(double input, double output, String from, String to) {
        System.out.println(input + " degrees " + from + " is equal to " + output + " degrees " + to + ".");
    }
}
