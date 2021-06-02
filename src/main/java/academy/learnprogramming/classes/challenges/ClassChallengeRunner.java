package academy.learnprogramming.classes.challenges;

/**
 * @author Matt Luffman
 * Date: 5/28/2021
 * Time: 8:14 PM
 */
public class ClassChallengeRunner {

    public static void main(String[] args) {
        testBankAccount();
    }

    private static void testBankAccount() {
        BankAccount ba = new BankAccount();
        ba.setBalance(99.20);
        System.out.print("Deposit 24 to 99.20: ");
        ba.deposit(24);
        System.out.println(ba.getBalance());
        System.out.print("After adding -30: ");
        ba.deposit(-30);
        System.out.println(ba.getBalance());

        System.out.print("Withdrawing 23.2 for new balance of 100: ");
        ba.withdrawal(23.2);
        System.out.println(ba.getBalance());
        System.out.print("Can't withdraw 200 from 100: ");
        ba.withdrawal(200.00);
        System.out.println(ba.getBalance());

        System.out.println("Instructor test");
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setAccountNumber(12345);
        bobsAccount.setBalance(0.0);
        bobsAccount.setEmail("myemail@bob.com");
        bobsAccount.setPhone("(087) 123-4567");
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}
