package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Grocery {

    private static Scanner scanner = new Scanner(System.in);

    private static Input input = new Input(new Scanner(System.in));

    private static boolean yesNoInput;

    public static HashMap<String, ArrayList<String>> getCompleteGroceryList() {

        return completeGroceryList;

    }

    public static void setCompleteGroceryList(HashMap<String, ArrayList<String>> completeGroceryList) {

        Grocery.completeGroceryList = completeGroceryList;

    }

    public static String getGroceryListName() {

        return groceryListName;

    }

    public static void setGroceryListName(String groceryListName) {

        Grocery.groceryListName = groceryListName;

    }

    public static ArrayList<String> getGroceryList() {

        return groceryList;

    }

    public static void setGroceryList(ArrayList<String> groceryList) {

        Grocery.groceryList = groceryList;

    }

    public static String getItemCategory() {

        return itemCategory;

    }

    public static void setItemCategory(String itemCategory) {

        Grocery.itemCategory = itemCategory;

    }

    public static String getItemName() {

        return itemName;

    }

    public static void setItemName(String itemName) {

        Grocery.itemName = itemName;

    }

    public static String getNumOfItems() {

        return numOfItems;

    }

    public static void setNumOfItems(String numOfItems) {

        Grocery.numOfItems = numOfItems;

    }

    private static HashMap<String, ArrayList<String>> completeGroceryList = new HashMap<>();

    public static void makeGroceryHash() {

        completeGroceryList.put(groceryListName, groceryList);

    }

    private static String groceryListName;

    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void makeArrayList() {

        groceryList.add("Category: " + itemCategory + " | " + itemName + " | " + numOfItems);

    }

    private static String itemCategory;

    private static String itemName;

    private static String numOfItems;

    public Grocery(HashMap<String, ArrayList<String>> completeGroceryList) {

        this.completeGroceryList = completeGroceryList;

    }

    public static void groceryApp3() {

        itemCategory = input.getString("Select a category:\nBeverages | Bread | Canned | Dairy | Meat | Produce | Other: ");
        itemName = input.getString("Enter the name of the item: ");
        numOfItems = input.getString("Enter the number of items: ");
        yesNoInput = input.yesNo("Would you like to finalize this list? If you select no, you can make a new item.\n(Y)es or (N)o: ");

        if (yesNoInput) {

            makeArrayList();
            makeGroceryHash();

            System.out.println(completeGroceryList.get(groceryListName));

            for(String i: completeGroceryList.keySet()) {
                System.out.print(completeGroceryList.get(i));
            }

        } else {

        makeArrayList();
        makeGroceryHash();
        groceryApp2();

        }

    }

    public static void groceryApp2() {

        groceryListName = input.getString("Enter a title for your grocery list: ");
        yesNoInput = input.yesNo("Would you like to enter a new item? (Y)es or (N)o: ");

        if (yesNoInput) {

            groceryApp3();

        } else {

        makeArrayList();
        makeGroceryHash();

        System.out.println("Okay, goodbye");

        }

    }

    public static void groceryApp() {

        yesNoInput = input.yesNo("Would you like to make a grocery list? (Y)es or (N)o: ");

        if (yesNoInput) {

            groceryApp2();

        } else {

            System.out.println("Okay, goodbye");

        }

    }

    public static void main(String[] args) {

        groceryApp();

    }

}
