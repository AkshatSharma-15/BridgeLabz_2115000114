public class BankAccount {
    private static String bankName = "HDFC Bank";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;  
    }
    
    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    // Method to display account details with instanceof check
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {  
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
    
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount account1 = new BankAccount("Akshat", "137822");
        BankAccount account2 = new BankAccount("Ram", "849364");
        
        // Display account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        
        // Display total number of accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}