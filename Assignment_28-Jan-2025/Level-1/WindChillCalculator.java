import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Using the wind chill formula
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking temperature and wind speed as input from the user.
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = sc.nextDouble();

        // Calculate the wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.println("The wind chill temperature is: " + windChill);
    }
}
