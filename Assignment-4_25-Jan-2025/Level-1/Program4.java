import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        
        // Declaring variables.
        double total = 0.0;
        int index = 0;
        
        // Implementing logic.
        while (true) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();
            
            if (input <= 0 || index == 10) {
                break; 
            }
            
            numbers[index] = input;
            index++; 
        }
        
        for (int i = 0; i < index; i++) {
            total += numbers[i]; 
        }

        System.out.println("The numbers entered are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("The sum of all numbers is: " + total);
    }
}
