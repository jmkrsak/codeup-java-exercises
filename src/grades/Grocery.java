package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Grocery {

//    private String groceryList;
//
//    private int howMany;
//
//    public Grocery(String groceryList, int howMany) {
//        this.groceryList = groceryList;
//        this.howMany = howMany;
//    }
//
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



}
