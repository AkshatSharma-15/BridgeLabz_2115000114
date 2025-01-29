import java.util.Scanner;

public class FibonacciSequenceGenerator {
    
    public static void main(String[] args) {
        int terms = getInput("Enter the number of terms for the Fibonacci sequence: ");
        generateFibonacci(terms);
    }
    
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }
    
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        if (terms >= 1) {
            System.out.print(a + " ");
        }
        if (terms >= 2) {
            System.out.print(b + " ");
        }
        for (int i = 3; i <= terms; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }
}
