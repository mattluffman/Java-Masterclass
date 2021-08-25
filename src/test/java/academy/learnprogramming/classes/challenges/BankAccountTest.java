package academy.learnprogramming.classes.challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 5/28/2021
 * Time: 8:03 PM
 */
public class BankAccountTest {

    BankAccount ba;
    private final double INITIAL_BALANCE = 23405.37;

    @Before
    public void setup() {
        ba = new BankAccount();
        ba.setAccountNumber(12345);
        ba.setCustomerName("Matt Luffman");
        ba.setPhone("lol");
        ba.setEmail(":P");
        ba.setBalance(0.0);
    }

    @Test
    public void deposit_negative_doesntChange() {
        ba.setBalance(INITIAL_BALANCE);
        ba.deposit(-50);
        assertEquals(INITIAL_BALANCE, ba.getBalance(), 0.0);
    }

    @Test
    public void deposit_adds() {
        ba.setBalance(INITIAL_BALANCE);
        ba.deposit(50);
        assertEquals(INITIAL_BALANCE + 50, ba.getBalance(), 0.0);
    }

    @Test
    public void withdraw_noOverdraft() {
        ba.setBalance(INITIAL_BALANCE);
        ba.withdrawal(25000.00);
        assertEquals(INITIAL_BALANCE, ba.getBalance(), 0.0);
    }

    @Test
    public void withdraw_happyPath() {
        ba.setBalance(INITIAL_BALANCE);
        ba.withdrawal(15.45);
        assertEquals((INITIAL_BALANCE - 15.45), ba.getBalance(), 0.0);
    }
}