package academy.learnprogramming.classes.challenges;

/**
 * @author Matt Luffman
 * Date: 5/28/2021
 * Time: 7:32 PM
 */
public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    //<editor-fold desc="Getters/Setters">
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //</editor-fold>

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Depositing " + amount + ". New balance: " + this.balance);
        } else {
            System.out.println("Can't deposit negative amount.");
        }
    }

    public void withdrawal(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("Subtracting " + amount + ". New balance: " + this.balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }


}
