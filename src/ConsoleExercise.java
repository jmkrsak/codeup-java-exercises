import java.util.Scanner;

public class ConsoleExercise {
   public static void main(String[] args) {
      String name = "codeup";
      System.out.printf("Hello there, %s. Nice to see you.%n", name);
      String greeting = "Salutations";
      System.out.printf("%s, %s!%n", greeting, name);

//      Scanner scanner = new Scanner(System.in);
//      System.out.print("Enter something: ");
//      String userInput = scanner.next() + " " + scanner.next();
//      System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//      Scanner scannerTwo = new Scanner(System.in);
//      System.out.print("Enter something: ");
//      String userInputTwo = scannerTwo.nextLine();
//      System.out.println("You entered: --> \"" + userInputTwo + "\" <--");

      double pi = 3.14159;
      System.out.println("The value of pi is approximately " + pi + ".");

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int userInt = scanner.nextInt();

      Scanner scannerTwo = new Scanner(System.in);
      System.out.print("Enter 3 words: ");
      String userInput = scannerTwo.next();
      String userInputTwo = scannerTwo.next();
      String userInputThree = scannerTwo.next();
      System.out.println(userInput + "\n" + userInputTwo + "\n" + userInputThree);
      System.out.printf("%s%n%s%n%s%n", userInput, userInputTwo, userInputThree);

   }
}