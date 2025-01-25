import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.println("Enter a number: ");
        long number = sc.nextLong();
        
        number = Math.abs(number);

        int[] frequency = new int[10];

        while (number > 0) {
            int digit = (int) (number % 10); 
            frequency[digit]++; 
            number /= 10; 
        }

        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { 
                System.out.println(i + "\t" + frequency[i]);
            }
        }
    }
}
