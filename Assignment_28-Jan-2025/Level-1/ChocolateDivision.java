import java.util.Scanner;

public class ChocolateDivision {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; // Calculate chocolates per child
        int remainingChocolates = numberOfChocolates % numberOfChildren; // Calculate remaining chocolates
        return new int[]{chocolatesPerChild, remainingChocolates}; // Return both as an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of chocolates and number of children as input from the user.
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Handle division by zero (i.e., no children)
        if (numberOfChildren == 0) {
            System.out.println("There are no children to distribute chocolates.");
        } else {
            // Find the number of chocolates each child gets and the remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("Each child gets: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
