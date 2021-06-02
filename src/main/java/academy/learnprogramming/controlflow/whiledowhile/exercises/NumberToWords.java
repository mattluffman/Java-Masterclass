package academy.learnprogramming.controlflow.whiledowhile.exercises;

/**
 * section 5, exercise 23
 *
 * @author Matt Luffman
 * Date: 5/18/2021
 * Time: 6:00 PM
 */
public class NumberToWords {

    /**
     * Write a method called numberToWords with one int parameter named number.
     *
     * The method should print out the passed number using words for the digits.
     *
     * If the number is negative, print "Invalid Value".
     *
     * To print the number as words, follow these steps:
     *
     * 1. Extract the last digit of the given number using the remainder operator.
     * 2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
     * 3. Remove the last digit from the number.
     * 4. Repeat Steps 2 through 4 until the number is 0.
     *
     * The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
     *
     * The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
     *
     * Use the method reverse within the method numberToWords in order to print the words in the correct order.
     *
     * Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called
     * getDigitCount.
     *
     * The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
     * For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
     *
     * Example Input/Output - getDigitCount method
     *
     * * getDigitCount(0); should return 1 since there is only 1 digit
     * * getDigitCount(123); should return 3
     * * getDigitCount(-12); should return -1 since the parameter is negative
     * * getDigitCount(5200); should return 4 since there are 4 digits in the number
     *
     * Example Input/Output - reverse method
     *
     * * reverse(-121); should  return -121
     * * reverse(1212); should return  2121
     * * reverse(1234); should return 4321
     * * reverse(100); should return 1
     *
     * Example Input/Output - numberToWords method
     *
     * * numberToWords(123); should print "One Two Three".
     * * numberToWords(1010); should print "One Zero One Zero".
     * * numberToWords(1000); should print "One Zero Zero Zero".
     * * numberToWords(-12); should print "Invalid Value" since the parameter is negative.
     *
     *
     * HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print "One Zero Zero". To get the number of zeroes, check the difference between the digit count from the original number and the
     * reversed number.
     *
     * NOTE: When printing words, each word can be in its own line. For example, numberToWords(123); can be:
     *
     * One
     * Two
     * Three
     *
     * They don't have to be separated by a space.
     *
     * NOTE: The methods numberToWords, getDigitCount, reverse should be defined as public static like we have been doing so far in the course.
     * NOTE: In total, you have to write 3 methods.
     *
     * NOTE: Do not add a main method to the solution code.
     */

    // TODO: refactor this to have another method return the value so you can more easily unit test that.
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            StringBuilder output = new StringBuilder();
            int reverse = reverse(number);
            final int digits = getDigitCount(number);
            int digitCount = 0;
            while (reverse > 0) {
                int lastDigit = reverse % 10;
                switch (lastDigit) {
                    case 0:
                        output.append("Zero ");
                        break;
                    case 1:
                        output.append("One ");
                        break;
                    case 2:
                        output.append("Two ");
                        break;
                    case 3:
                        output.append("Three ");
                        break;
                    case 4:
                        output.append("Four ");
                        break;
                    case 5:
                        output.append("Five ");
                        break;
                    case 6:
                        output.append("Six ");
                        break;
                    case 7:
                        output.append("Seven ");
                        break;
                    case 8:
                        output.append("Eight ");
                        break;
                    case 9:
                        output.append("Nine ");
                        break;
                    default:
                        throw new IllegalArgumentException("We shouldn't be here");
                }

                ++digitCount;
                reverse /= 10;
            }

            if (digitCount < digits) {
                // TODO: look into String.repeat() option suggested by IDE
                for (int i = digitCount; i < digits; i++) {
                    output.append("Zero ");
                }
            }

            System.out.println(output);
        }
    }


    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int count = 0;
            int copy = number;
            do {
                count++;
                //drop last digit
                copy /= 10;
            } while (copy > 0);
            return count;
        }
    }

    /**
     * The method reverse should have one int parameter and return the reversed number (int).
     * For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
     * <br/>
     * from the palindrome exercise {@link PalindromeChecker#isPalindrome(int)}
     * <pre>
     * Extract the last digit of the given number by performing the modulo division (remainder).
     * Store the last digit to some variable say lastDigit = num % 10.
     * Increase the place value of reverse by one.
     * To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
     * Add lastDigit to reverse.
     * Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
     * Repeat steps until number is not equal to (or greater than) zero.</pre>
     *
     * @param number to reverse
     * @return reverse of passed in int
     */
    public static int reverse(int number) {
        final boolean negative = number < 0;

        int reverse = 0;
        int positiveCopy = negative ? -number : number; // Could also do Math.abs() like in the palindrome exercise.
        while (positiveCopy > 0) {
            int lastDigit = positiveCopy % 10;
            reverse *= 10;
            reverse += lastDigit;

            positiveCopy /= 10;
        }

        return negative ? -reverse : reverse;
    }

    //TODO: have a look at the solutions from the TA Eddie in the Q/a section
    /*
    Definitely challenging and requiring everything we've learned (switch, for loop, while loop, do while loop).

I'm providing two solutions: a) manipulation of numbers and b) manipulation of strings.  Then I add a bonus explanation of the design logic that make the code more concise by printing the extra "ZERO" with the existing switch case statements instead of adding extra if conditions.

a) Solution by manipulating numbers:

Although the instruction provided the hint "to get the number of zeroes, check the difference between the digit count from the original number and the reversed number", I decided to use the existing switch/case to print out the extra "ZERO" by looping and using the digit count from the original number as the for loop condition.  This makes the code much more concise without the need for additional code to handle the extra zeros.

public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0) System.out.print("Invalid Value");
        int count = getDigitCount(number);
        number = reverse(number);
        for(int i=0; i<count; i++){
                int digit = number%10;
                switch(digit){
                case 0:
                    System.out.print("Zero "); break;
                case 1:
                    System.out.print("One "); break;
                case 2:
                    System.out.print("Two "); break;
                case 3:
                    System.out.print("Three "); break;
                case 4:
                    System.out.print("Four "); break;
                case 5:
                    System.out.print("Five "); break;
                case 6:
                    System.out.print("Six "); break;
                case 7:
                    System.out.print("Seven "); break;
                case 8:
                    System.out.print("Eight "); break;
                case 9:
                    System.out.print("Nine "); break;
                default: break;
                }
                number /= 10;
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int digit = 0;
        while(number!=0) {
            digit = number%10;
            reverse = (reverse*10) + digit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number<0) return -1;
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number>0);
        return count;
    }
}


b) Alternative solution by manipulating strings:

To make the code a bit more concise and easier to get "count" and "reverse", we can manipulate strings. For getDigitCount(), we can convert number to a string and use the String's built-in method of .length() to get the count.

public static int getDigitCount(int number){
    if (number<0) {
        return -1;
    }

    String numberStr = Integer.toString(number);
    return numberStr.length();
}
This can be simplified using a ternary operator to perform the validation as well as the return statement.

    public static int getDigitCount(int number){
        return (number<0) ? -1 : Integer.toString(number).length();
    }
To reverse the number, we can also use String and StringBuilder.  Unfortunately, the String class does not have the built-in function of .reverse(), but StringBuilder does.

    public static int reverse(int number){
        int num = (number<0) ? number*-1 : number; // if number is negative, use ternary to make number positive

        String forwardStr = Integer.toString(num); // convert num to string
        StringBuilder forwardSB = new StringBuilder(forwardStr); // use helper to build string
        String reverseStr = forwardSB.reverse().toString(); // use built-in function to reverse string, use .toString to convert from StringBuilder to String
        int reverse = Integer.parseInt(reverseStr); // convert string back to number using .parseInt

        if(number<0) reverse *=-1; // if original number was negative, convert the reverse number back to a negative number
        return reverse;
    }
This can be simplified to:

    public static int reverse(int number){
        int num = (number<0) ? number*-1 : number;

        StringBuilder forwardSB = new StringBuilder(Integer.toString(num));
        int reverse = Integer.parseInt(forwardSB.reverse().toString());

        return (number<0) ? reverse*-1 : reverse;
    }
Taken all together, here is the alternative solution using Strings/StringBuilder:

public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0) System.out.print("Invalid Value");
        int count = getDigitCount(number);
        number = reverse(number);
        for(int i=0; i<count; i++){
                int digit = number%10;
                switch(digit){
                case 0:
                    System.out.print("Zero "); break;
                case 1:
                    System.out.print("One "); break;
                case 2:
                    System.out.print("Two "); break;
                case 3:
                    System.out.print("Three "); break;
                case 4:
                    System.out.print("Four "); break;
                case 5:
                    System.out.print("Five "); break;
                case 6:
                    System.out.print("Six "); break;
                case 7:
                    System.out.print("Seven "); break;
                case 8:
                    System.out.print("Eight "); break;
                case 9:
                    System.out.print("Nine "); break;
                default: break;
                }
                number /= 10;
        }
    }

    public static int reverse(int number){
        int num = (number<0) ? number*-1 : number;
        StringBuilder forwardSB = new StringBuilder(Integer.toString(num));
        int reverse = Integer.parseInt(forwardSB.reverse().toString());
        return (number<0) ? reverse*-1 : reverse;
    }

    public static int getDigitCount(int number){
        return (number<0) ? -1 : Integer.toString(number).length();
    }
}


Explanation of Design Logic to Print Extra "ZERO":

In my above solutions, I kept the code concise by using the existing switch case statements to print the extra "ZERO" instead of adding extra lines of code and if statements to handle printing the extra "ZERO".  Although the instruction hints "to get the number of zeroes, check the difference between the digit count from the original number and the reversed number", you can simply print the extra "ZERO" by using digit count of the original number (i.e. the full digit count) to print reverse since reverse eventually becomes 0 after all the reverse digits have been printed and it will just keep printing "ZERO" until count = 0.



Let's follow the steps with a visual example:

number = 12300 and count = 5.

reverse = 321 and we don't want to worry about the reverse count.



So count = 5 and that means we want to loop 5 times. Let's do each iteration of the loop.

Loop #1:

reverse = 321 and we print reverse%10 = 1 (print "ONE")

then we chop off the least significant digit so now reverse = 32.

we also decrement count = 4.

Loop #2:

reverse = 32 and we print reverse%10 = 2 (print "TWO")

then we chop off the least significant digit so now reverse = 3.

we also decrement count = 3.

Loop #3:

reverse = 3 and we print reverse%10 = 3 (print "THREE")

then we chop off the least significant digit so now reverse = 0...this is the key point!

we also decrement count = 2.

Loop #4:

reverse = 0 and we print reverse%10 = 0 (print "ZERO")

then we chop off the least significant digit so it remains reverse = 0.

we also decrement count = 1.

Loop #5:

reverse = 0 and we print reverse%10 = 0 (print "ZERO")

then we chop off the least significant digit so it remains reverse = 0...

but count = 0 so we stop the loop.



Hope this posting is helpful in your learning.  Cheers!
     */
}
