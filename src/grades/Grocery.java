package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Grocery {

    private static final Scanner scanner = new Scanner(System.in);

    private static final Input input = new Input(new Scanner(System.in));

    private static HashMap<String, ArrayList<String>> completeGroceryList;

    public static void makeGroceryHash() {
        completeGroceryList.put(groceryListName, groceryList);
    }

    private static String groceryListName;

    private static ArrayList<String> groceryList;

    public static void makeArrayList() {
        groceryList.add(itemName + " " + numOfItems);
    }

    private String itemCategory;

    private static String itemName;

    private static int numOfItems;

    public Grocery(HashMap<String, ArrayList<String>> completeGroceryList) {
        this.completeGroceryList = completeGroceryList;
    }

    public static void groceryApp3() {

        System.out.println("Select a category.");
        String category = input.getString("Beverages | Bread | Canned | Dairy | Meat | Produce | Other");

        itemName = input.getString("Enter the name of the item: ");

        numOfItems = input.getInt("Enter the number of items");

        boolean yesNoInput = input.yesNo("Would you like to finalize this list? (Y)es or (N)o: ");

        if (yesNoInput) {

            makeArrayList();
            makeGroceryHash();

        } else {

        System.out.println("Okay, goodbye");

        }

    }

    public static void groceryApp2() {

        boolean newYesNoInput = input.yesNo("Would you like to enter a new item? (Y)es or (N)o: ");

        if (newYesNoInput) {
            scanner.nextLine();
            groceryApp3();

        } else {

        System.out.println("Okay, goodbye");

        }

    }

    public static void groceryApp() {

        boolean yesNoInput = input.yesNo("Would you like to make a grocery list? (Y)es or (N)o: ");

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

//    public String getGroceryList() {
//        return groceryList;
//    }
//
//    public int getHowMany() {
//        return howMany;
//    }
//

//    public static void groceryList() {
//
//        Scanner scanner = new Scanner(System.in);
//
//        HashMap<String, Grocery> groceryHash = new HashMap<>();
//
//        Grocery apple = new Grocery("apple", 2);
//        groceryHash.put("Fruit", apple);
//
//        Grocery steak = new Grocery("steak", 1200);
//        groceryHash.put("Cow", steak);
//
//        Grocery cheese = new Grocery("cheese", 69);
//        groceryHash.put("Dairy", cheese);
//
//        Grocery bacon = new Grocery("bacon", 31000);
//        groceryHash.put("Pork", bacon);
//
//        System.out.print("Here is the Grocery list: \n");
//
//        for(int i: groceryHash.keySet()) {
//            System.out.print("| " + i + " |  ");
//        }
//        System.out.print("\nWhich grocery item would you like to see: ");
//
//        int userInput = Integer.parseInt(scanner.nextLine());
//
//        if (groceryHash.containsKey(userInput)) {
//            System.out.println("Food type: " + groceryHash.get(userInput).getGroceryList() + " - GitHub Username: " + userInput);
//        } else {
//            System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\".");
//        }
//
//        yesNo();
//
//    }
//
//    public static void yesNo() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Would you like to see another student?: ");
//
//        if (scanner.hasNext("y") || scanner.hasNext("Y") || scanner.hasNext("yes") || scanner.hasNext("Yes")) {
//            scanner.nextLine();
//            groceryList();
//        } else if (scanner.hasNext("n") || scanner.hasNext("N") || scanner.hasNext("no") || scanner.hasNext("No")) {
//            scanner.nextLine();
//        } else {
//            scanner.nextLine();
//
//            yesNo();
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        groceryList();
//
//    }
//
//    public static void createGroceryList() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Would you like to create a grocery list?: ");
//
//        if (scanner.hasNext("y") || scanner.hasNext("Y") || scanner.hasNext("yes") || scanner.hasNext("Yes")) {
//            scanner.nextLine();
//            enterANewItem();
//        } else if (scanner.hasNext("n") || scanner.hasNext("N") || scanner.hasNext("no") || scanner.hasNext("No")) {
//            scanner.nextLine();
//        } else {
//            scanner.nextLine();
//
//            createGroceryList();
//
//        }
//
//    }
//
//    public static void enterANewItem() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Would you like enter a new item?: ");
//
//        if (scanner.hasNext("y") || scanner.hasNext("Y") || scanner.hasNext("yes") || scanner.hasNext("Yes")) {
//            scanner.nextLine();
//            enterANewItem();
//        } else if (scanner.hasNext("n") || scanner.hasNext("N") || scanner.hasNext("no") || scanner.hasNext("No")) {
//            scanner.nextLine();
//        } else {
//            scanner.nextLine();
//
//            renderList();
//
//        }
//
//        public static void renderList() {
//
//        }
//
//    }

