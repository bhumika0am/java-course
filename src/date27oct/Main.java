package date27oct;
//define the BankName enum
enum BankName {
 ICICI(6.3),
 HDFC(5.8),
 SBI(6.0);
 double intRate;//interest rate attribute for each bank
 //constructor for the enum that sets the interest rate
 BankName(double intRate) {
     this.intRate = intRate;
 }
 //getter method for the interest rate
 public double getIntRate() {
     return intRate;
 }
}
//define the BankAccount class
class BankAccount {
 private double accBal;
 private String accHolderName;
 private BankName bankName; 
 public BankAccount(double accBal, String accHolderName, BankName bankName) {// constructor
     this.accBal = accBal;
     this.accHolderName = accHolderName;
     this.bankName = bankName;
 }
 public double calInt(int numOfYears) { //method to calculate total interest
     double totInt = bankName.getIntRate() * numOfYears * accBal / 100;
     return totInt;
 }
 // getters for displaying information
 public String getAccHolderName() {
     return accHolderName;
 }
 public BankName getBankName() {
     return bankName;
 }
 public double getAccBal() {
     return accBal;
 }
}
public class Main {//main class
	public static void main(String[] args) {
     // create new accounts with different banks
     BankAccount ba1 = new BankAccount(12000,"ravi", BankName.SBI);
     BankAccount ba2 = new BankAccount(15000,"ram", BankName.ICICI);
     BankAccount ba3 = new BankAccount(10000,"raman", BankName.HDFC);
     // Print bank name and total interest for each account over 5 years
     int numberOfYears = 5;
     System.out.println("Account Holder: " + ba1.getAccHolderName() + ", Bank: " + ba1.getBankName() + ", Total Interest: " + ba1.calInt(numberOfYears));
     System.out.println("Account Holder: " + ba2.getAccHolderName() + ", Bank: " + ba2.getBankName() + ", Total Interest: " + ba2.calInt(numberOfYears));
     System.out.println("Account Holder: " + ba3.getAccHolderName() + ", Bank: " + ba3.getBankName() + ", Total Interest: " + ba3.calInt(numberOfYears));
 }
}