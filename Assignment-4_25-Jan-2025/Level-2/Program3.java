import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialising variables and arrays.
        int maxDigits = 10; 
        int[] digits = new int[maxDigits];
        int index = 0;

        // Implementing logic.
        while (number != 0 && index < maxDigits) {
            digits[index] = number % 10;  
            number = number / 10;  
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        // Implementing logic.
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        if (secondLargest == -1) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        }
    }
}
