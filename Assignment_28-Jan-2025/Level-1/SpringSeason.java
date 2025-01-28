import java.util.Scanner;

public class SpringSeason {

    // Method to check if the given month and day fall in Spring season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 to March 31
            (month == 4 && day >= 1 && day <= 30) ||  // April
            (month == 5 && day >= 1 && day <= 31) ||  // May
            (month == 6 && day >= 1 && day <= 20)) {  // June 1 to June 20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Month and Day as input from the user.
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt();

        // Implementing logic.
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date. Please enter a valid month and day.");
        } else {
            // Check if it's Spring Season
            boolean isSpring = isSpringSeason(month, day);

            if (isSpring) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }
    }
}
