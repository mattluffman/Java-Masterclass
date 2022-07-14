package academy.learnprogramming.arraysandlists.arraylist;

import java.util.ArrayList;

/**
 * section 8, lecture 105, 106
 *
 * @author Matt Luffman
 * Date: 7/13/2022
 * Time: 7:04 PM
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>(); // class vs primative, so it has it's own constructor

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("you  have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println();
    }

    public String findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem); // similar to the above, but gives you the element
        if (position >= 0) {
            return groceryList.get(position);
        }

        return null;
    }
}
