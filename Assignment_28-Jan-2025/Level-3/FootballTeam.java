import java.util.Scanner;

public class FootballTeam {

    public static void main(String[] args) {
        // Create an array to store the heights of 11 football players
        int[] heights = new int[11];
        
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Taking height of each player as input from the user.
        System.out.println("Enter the height (in cm) for each player (between 150 and 250 cm): ");
        for (int i = 0; i < heights.length; i++) {
            while (true) {
                System.out.print("Player " + (i + 1) + ": ");
                int height = sc.nextInt();
                if (height >= 150 && height <= 250) {
                    heights[i] = height;
                    break;
                } else {
                    System.out.println("Invalid height. Please enter a value between 150 and 250 cm.");
                }
            }
        }

        // Find the sum of the heights
        int sum = findSum(heights);

        // Find the mean height
        double mean = findMean(sum, heights.length);

        // Find the shortest height
        int shortest = findShortest(heights);

        // Find the tallest height
        int tallest = findTallest(heights);

        // Display the results
        System.out.println("\nHeights of the players (in cm): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }

    // Method to calculate the sum of the heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double findMean(int sum, int numberOfPlayers) {
        return (double) sum / numberOfPlayers;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
