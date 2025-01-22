import java.util.Scanner;

public class kilometers_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in kilometers: ");
        double d = sc.nextDouble();

        double miles = d * 0.621371;

        System.out.println("Distance in miles is: " + miles);
    }
}
