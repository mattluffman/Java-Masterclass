package academy.learnprogramming.arrays;

/**
 * section 8, lecture 99 - Arrays
 *
 * @author Matt Luffman
 * Date: 6/24/2022
 * Time: 12:11 PM
 */
public class Main {

    public static void main(String[] args) {
        // tedious way to setup
        int[] myIntArray1 = new int[10];
        myIntArray1[0] = 45;
        myIntArray1[1] = 476;
        myIntArray1[5] = 50; // saves in the 6th spot

        //even better than above
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray2[6]);
        System.out.println(myIntArray2[8]);

        // setup using a loop
        int[] myIntArray3 = new int[10];
        for (int i = 0; i < 10; ++i) {
            myIntArray3[i] = i * 10;
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println("Element " + i + ", value is " + myIntArray3[i]);
        }
    }
}
