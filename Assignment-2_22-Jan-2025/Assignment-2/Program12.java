import java.util.Scanner;
public class Program12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float pounds = sc.nextFloat();
        float kilograms = pounds / 2.2f;
        System.out.println("The weight of the person in pounds is " + pounds + " and in kilograms is " + kilograms);
    }
}