import java.util.Scanner;

public class university_discount_2 {
    public static void main(String[] args) {
        //Creating Scanner class object.
        Scanner sc = new Scanner(System.in);

        //Initialising and defining variables.
        System.out.println("Enter the fee of university: ");
        double fee = sc.nextDouble();

        System.out.println("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discount = (discountPercent * fee)/100;

        double finalFee = fee - discount;

        System.out.println(" The discount amount is INR: " + discount + " and final discounted fee is INR: " + finalFee);
    }
}
