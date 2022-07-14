package academy.learnprogramming.arraysandlists.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * section 8, lecture 105, 106
 *
 * with 2nd round of edits you could now change the implementation to an array & main wouldn't need to change
 *
 * @author Matt Luffman
 * Date: 7/13/2022
 * Time: 7:03 PM
 */
public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = SCANNER.nextInt();
            SCANNER.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To use copy methods");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(SCANNER.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter current item name: ");
        String item = SCANNER.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = SCANNER.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String item = SCANNER.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Enter item to search for: ");
        String searchItem = SCANNER.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    /**
     * ways to copy
     */
    private static void processArrayList() {
        // first way
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(groceryList.getGroceryList());
        System.out.println("new Array List: " + newArrayList);

        // 2nd way
        ArrayList<String> nextArrayList = new ArrayList<>(groceryList.getGroceryList());
        System.out.println("next Array List: " + nextArrayList);

        // 3rd way
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
        System.out.println("new array: " + Arrays.toString(myArray));
    }
}
