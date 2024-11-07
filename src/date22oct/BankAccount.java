package date22oct;
public class BankAccount {
    // Fields for the BankAccount class
    private String accountHolderName;
    private String bankName;
    private double accountBalance;
    // Constructor that initializes the BankAccount object
    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }
    // Method to get the current balance
    public double getBalance() {
        return accountBalance;
    }
    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited: " + amount);
        } 
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > accountBalance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Current Balance: " + getBalance());
        System.out.println();
    }
    // Main method to create bank accounts and perform transactions
    public static void main(String[] args) {
        // Creating three BankAccount objects with different account holders and banks
        BankAccount account1 = new BankAccount("Bhumika", "BOB", 23000.0);
        BankAccount account2 = new BankAccount("Krishna", "Karnataka ", 18000.0);
        BankAccount account3 = new BankAccount("vaishu", "SBI", 100.0);
        // Performing deposit and withdrawal operations for account1 (ICICI)
        System.out.println("Account 1 - BOB Bank:");
        account1.deposit(500.0);
        account1.withdraw(300.0);
        account1.displayAccountDetails();

        // Performing deposit and withdrawal operations for account2 (HDFC)
        System.out.println("Account 2 - Karnataka Bank:");
        account2.deposit(800.0);
        account2.withdraw(1000.0);
        account2.displayAccountDetails();

        // Performing deposit and withdrawal operations for account3 (SBI)
        System.out.println("Account 3 - SBI Bank:");
        account3.deposit(600.0);
        account3.withdraw(1200.0);
        account3.displayAccountDetails();
    }
}
