package academy.learnprogramming.classes.exercises;

/**
 * @author Matt Luffman
 * Date: 5/28/2021
 * Time: 7:15 PM
 */
public class ClassExerciseRunner {

    public static void main(String[] args) {
        testSimpleCalculator();
        testPerson();
    }

    /**
     * OUTPUT
     *
     * add= 9.0
     * subtract= 1.0
     * multiply= 0.0
     * divide= 0.0
     */
    private static void testSimpleCalculator() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

    /**
     * OUTPUT
     *
     * fullName=
     * teen= false
     * fullName= John
     * teen= true
     * fullName= John Smith
     */
    private static void testPerson() {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
