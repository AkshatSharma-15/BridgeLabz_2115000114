import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaring Array of size 10.
        int[] age = new int[10];

        // Taking inputs from the user and implementing logic.
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
            
            if (age[i] < 0) {
                System.out.println("Invalid Age.");
            }
            else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + age[i] + " cannot vote.");
            }
        }
    }
}