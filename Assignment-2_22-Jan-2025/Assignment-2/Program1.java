import java.util.Scanner;
public class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + num1 + " and " + num2);
    }
}