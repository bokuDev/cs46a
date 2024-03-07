// Problem 3
/**
 * Represents a Bank Account
 * @author Canhui Huang
 */
class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    /**
     * Constructs a new Bank account
     */
    BankAccount() {
        this.accountNumber = -1;
        this.accountHolderName = "N/A";
        this.balance = 0;
    }

    /**
     * Constructs a new Bank account
     * @param accountNumber the number of the account
     * @param accountHolderName the name of the person who holds the account
     * @param balance the balance in the account
     */
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    /**
     * Adds the given amount to the balance
     * @param amount amount given to deposit
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Deducts the given amount from the balance
     * @param amount amount given to withdraw
     * @return the amount given to withdraw
     */
    public double withdraw(double amount) {
        this.balance -= amount;
        if (this.balance < 0 ) this.balance = 0;
        return this.balance;
    }

    /**
     * Display the balance of the account
     */
    public void displayBalance() {
        System.out.println("Balance: $" + this.balance);
    }

    public int getAccountNumber() { return this.accountNumber; }
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }

    public String getAccountHolderName() {return this.accountHolderName; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName;}

    public double getBalance() { return this.balance; }
    public void setBalance(double balance) { this.balance = balance; }

    /**
     * Main method that contains operations involving Bank Account
     */
    public static void main(String[] args) {
        // Instantiate circle object with radius = 5, and then display its area and circumference
        BankAccount bankAccount = new BankAccount(9000, "John Doe", 4000);

        bankAccount.displayBalance();
        System.out.println("Deposit $500 & withdraw $800.");
        bankAccount.deposit(500);
        bankAccount.withdraw(800);
        bankAccount.displayBalance();
    }
}
