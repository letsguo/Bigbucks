
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount{
    public BankAccount(String nm, double amt){
            name = nm;
            balance = amt;
    }
    
    // Deposits da moneyy
    public void deposit(double dp){
        if (dp >= 500) {
           System.out.println("Denied");
        } else {
           balance = balance + dp;
        }
    }
    
    public void withdraw(double wd){
        balance = balance - wd;
    }
    
    public String toString() {
        return "Name: " + this.name + " " + "Balance: " + this.balance;
    }
    
    public String getName() {
        return name;
    }
    
    public double getBalance() {
        return balance;
    }
    
    private String name;
    private double balance;
}
