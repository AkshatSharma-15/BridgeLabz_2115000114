import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaring arrays.
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking inputs from the user.
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter the height of friend " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        int youngestAge = ages[0];
        int youngestIndex = 0;
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        // Implementing logic.
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }

            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        System.out.println("The youngest friend is " + getFriendName(youngestIndex) + " with age " + youngestAge + ".");
        System.out.println("The tallest friend is " + getFriendName(tallestIndex) + " with height " + tallestHeight + " meters.");

    }

    public static String getFriendName(int index) {
        switch (index) {
            case 0: return "Amar";
            case 1: return "Akbar";
            case 2: return "Anthony";
            default: return "Unknown";
        }
    }
}
