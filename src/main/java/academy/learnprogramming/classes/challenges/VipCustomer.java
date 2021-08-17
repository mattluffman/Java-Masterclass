package academy.learnprogramming.classes.challenges;

/**
 * section 6, lecture 80 challenge
 *
 * @author Matt Luffman
 * Date: 8/17/2021
 * Time: 7:14 PM
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("no name", 0.0, "no email");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "no email");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
               "name='" + name + '\'' +
               ", creditLimit=" + creditLimit +
               ", emailAddress='" + emailAddress + '\'' +
               '}';
    }
}
