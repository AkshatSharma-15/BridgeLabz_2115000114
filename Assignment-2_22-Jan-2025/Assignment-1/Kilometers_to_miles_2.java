import java.util.Scanner;

public class Kilometers_to_miles_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaring variable.
        double km;

        System.out.println("Enter distance in km: ");
        
        // Taking input from the user.
        km = input.nextDouble();

        double miles = (1 / 1.6) * km;

        System.out.println("The total miles is: " + miles + " miles for the given " + km + " km");
    }
}
