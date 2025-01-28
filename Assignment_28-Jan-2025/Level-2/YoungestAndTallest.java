import java.util.Scanner;

public class YoungestAndTallest {

    // Method to find the youngest friend based on age
    public static String findYoungest(String[] friends, int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = friends[0];

        // Loop through ages to find the youngest
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest friend based on height
    public static String findTallest(String[] friends, double[] heights) {
        double tallestHeight = heights[0];
        String tallestFriend = friends[0];

        // Loop through heights to find the tallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store the names of friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        // Arrays to store the ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input for ages.
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
        }

        // Taking user input for heights
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter the height (in meters) of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find and display the youngest friend
        String youngest = findYoungest(friends, ages);
        System.out.println("The youngest friend is " + youngest + ".");

        // Find and display the tallest friend
        String tallest = findTallest(friends, heights);
        System.out.println("The tallest friend is " + tallest + ".");
    }
}
