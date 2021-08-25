package academy.learnprogramming.testingdebugging;

/**
 * section 18, lecture 318 on unit testing
 *
 * @author Matt Luffman
 * Date: 5/13/2021
 * Time: 5:00 PM
 */
public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }

    /**
     * @param amount $
     * @param branch branch argument is true if the customer is performing the transaction at a branch with a teller, false if they're performing it at an ATM
     */
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    /**
     * @param amount $
     * @param branch branch argument is true if the customer is performing the transaction at a branch with a teller, false if they're performing it at an ATM
     */
    public double withdraw(double amount, boolean branch) {
        if (amount > 500.00 && !branch) {
            throw new IllegalArgumentException();
        }

        balance -= amount;
        return balance;
    }

    // more methods that use firstName, lastName, & peform other functions
}
