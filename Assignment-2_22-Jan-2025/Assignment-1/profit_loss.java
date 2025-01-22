public class profit_loss {
    public static void main(String[] args) {
        // Initialising variables.
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;

        double profitPercentage = (profit *100) / costPrice;

        System.out.println("The Profit in INR is: " + profit + " and Profit Percentage is: " + profitPercentage + " %");
    }
}
