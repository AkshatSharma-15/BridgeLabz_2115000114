import java.util.Scanner;
public class distance_in_yards_miles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        float feet = sc.nextFloat();
        float yards = feet / 3;
        float miles = yards / 1760;
        System.out.println("The distance in feet is " + feet + ", in yards is " + yards + ", and in miles is " + miles);
    }
}