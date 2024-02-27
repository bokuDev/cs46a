public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters & Setters
    public int getAccountNumber() { return this.accountNumber; }
    public String getAccountHolderName() { return this.accountHolderName; }
    public double getBalance() { return this.balance; }
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public double withdraw(double amount) {
        if (this.balance - amount >= 0) {
          this.balance -= amount;
          return amount;
        }
        return 0;
    }

    public void displayAccountDetails() {
        System.out.println("Account number: " + this.accountNumber +
                            "\nAccount holder name: " + this.accountHolderName +
                            "\nBalance: " + this.balance + "\n");
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123456, "ramon", 0);
        BankAccount account2 = new BankAccount(123478, "Juan", 9000);
        BankAccount account3 = new BankAccount(98765, "Samira", 3000);

        account1.deposit(6050.80);
        account2.withdraw(1500);
        account3.deposit(1000);
        account3.withdraw(3000);

        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();
    }
}
