package academy.learnprogramming.testingdebugging;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Matt Luffman
 * Date: 5/13/2021
 * Time: 5:02 PM
 */
public class BankAccountTest {

    @Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Matt", "Luffman", 1000.00, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Matt", "Luffman", 1000.00, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @Test
    public void deposit() {
        BankAccount account = new BankAccount("Matt", "Luffman", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdraw() {
        fail("This test is yet to be implemented");
    }

    @Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Matt", "Luffman", 1000.00, BankAccount.SAVINGS);
        assertTrue("account is NOT a checking account", account.isChecking());
    }
}