import java.util.Scanner;

public class perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.println("Enter width of rectangle: ");
        double w = sc.nextDouble();

        double p = 2 * (l + w);

        System.out.println("Perimeter of rectangle is: " + p);
    }
}
