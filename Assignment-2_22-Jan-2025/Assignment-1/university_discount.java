public class university_discount {
    public static void main(String[] args) {
        // Initialising variables.
        int fee = 125000;
        int discountPercent = 10;

        // Calculating Discounted Amount.
        int discount = (discountPercent * fee) / 100;

        // Calculating discounts fee.
        int discountedFee = fee - discount;

        System.out.println("The discount amout is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
