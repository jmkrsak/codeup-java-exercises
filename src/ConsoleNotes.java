import java.util.Scanner;

public class ConsoleNotes {
    public static void main(String[] args) {
        String name = "laura";
        int age = 32;
        String lastName = "Ruiz";
        System.out.println(name);
        System.out.println("my name is " + name);
        System.out.printf("Hello %s, is your last name %s? Are you really %d?%n", name, lastName, age);

        Scanner myScanner = new Scanner(System.in);

        System.out.print("enter your city: ");
        String userInput = myScanner.nextLine();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("enter your age: ");
        int userAge = myScanner.nextInt();
        System.out.println("You entered: --> \"" + userAge + "\" <--");

        myScanner.nextLine();

        System.out.print("favorite restaurant: ");
        String faveRes = myScanner.nextLine();
        System.out.println("You entered: --> \"" + faveRes + "\" <--");


    }
}
