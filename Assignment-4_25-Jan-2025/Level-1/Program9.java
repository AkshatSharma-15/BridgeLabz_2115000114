import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Initialising 2-D array.
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Initialising 1-D array.
        int[] oneDArray = new int[rows * columns];
        
        int index = 0;

        // Implementing logic.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index++] = matrix[i][j];  
            }
        }

        System.out.println("The 2D Array (Matrix) is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The 1D Array after copying the elements is:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        System.out.println();
    }
}
