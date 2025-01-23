import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        // Implementing if-else Statement.
        if(n % 5 == 0)
            System.out.println("Is the number " + n + " divisible by 5? Yes");
        else    
            System.out.println("Is the number " + n + " divisible by 5? No");
    }
}