import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is valid (greater than or equal to 1582)
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582.");
            return false; // Invalid year input
        }

        // A leap year is divisible by 4, not divisible by 100, or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // It's a leap year
        } else {
            return false; // It's not a leap year
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Year to be checked as input from the user.
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
