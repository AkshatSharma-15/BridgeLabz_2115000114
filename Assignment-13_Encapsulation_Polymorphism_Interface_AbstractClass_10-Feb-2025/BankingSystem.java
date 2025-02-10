abstract class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        accountBalance -= amount;
    }

    abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Balance : " + accountBalance);
    }
}

interface Loanable {

    boolean applyForLoan(double loanAmount);

    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double annualInterestRate;

    public SavingsAccount(int accountNumber, String accountHolderName, double accountBalance, double annualInterestRate) {
        super(accountNumber, accountHolderName, accountBalance);
        this.annualInterestRate = annualInterestRate;
    }

    double calculateInterest() {
        return (getAccountBalance() * annualInterestRate) / 100;
    }

    public boolean applyForLoan(double loanAmount) {
        double maximumLoanLimit = calculateLoanEligibility();
        if (loanAmount <= maximumLoanLimit) {
            System.out.println("Loan applied successfully");
            return true;
        } else {
            System.out.println("Loan amount exceeds the maximum limit");
            return false;
        }
    }

    public double calculateLoanEligibility() {
        return getAccountBalance() * 2;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Annual Interest Rate : " + annualInterestRate);
        System.out.println("Interest Amount : " + calculateInterest());
        System.out.println();
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double annualInterestRate;

    public CurrentAccount(int accountNumber, String accountHolderName, double accountBalance, double annualInterestRate) {
        super(accountNumber, accountHolderName, accountBalance);
        this.annualInterestRate = annualInterestRate;
    }

    double calculateInterest() {
        return (getAccountBalance() * annualInterestRate) / 100;
    }

    public boolean applyForLoan(double loanAmount) {
        double maximumLoanLimit = calculateLoanEligibility();
        if (loanAmount <= maximumLoanLimit) {
            System.out.println("Loan applied successfully");
            return true;
        } else {
            System.out.println("Loan amount exceeds the maximum limit");
            return false;
        }
    }

    public double calculateLoanEligibility() {
        return getAccountBalance() * 3;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Annual Interest Rate : " + annualInterestRate);
        System.out.println("Interest Amount : " + calculateInterest());
        System.out.println();
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(43254, "ABC", 49999, 2);
        BankAccount currentAccount = new CurrentAccount(83625, "XYZ", 879888, 5);

        System.out.println("Savings Account Details : ");
        savingsAccount.displayDetails();

        System.out.println("Current Account Details : ");
        currentAccount.displayDetails();
    }
}