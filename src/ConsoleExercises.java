import java.util.Scanner;

public class ConsoleExercises {
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

      scanner.nextLine();

      System.out.print("Enter 3 words: ");
      String userInput = scanner.next();
      String userInputTwo = scanner.next();
      String userInputThree = scanner.next();
      System.out.println(userInput + "\n" + userInputTwo + "\n" + userInputThree);
      System.out.printf("%s%n%s%n%s%n", userInput, userInputTwo, userInputThree);

      scanner.nextLine();

      System.out.print("Enter a sentence: ");
      String userSentence = scanner.nextLine();
      System.out.println(userSentence);

      System.out.print("Enter the Length of your room: ");
      String length = scanner.nextLine();
      int intLength = Integer.parseInt(length);
      System.out.print("Enter the Width of your room: ");
      String width = scanner.nextLine();
      int intWidth = Integer.parseInt(width);
      int area = intLength * intWidth;
      int perimeter = (intLength + intWidth) * 2;
      System.out.print("If your room's length is " + length + ", and your room's width is "
              + width + "; your rooms area is " + area + ", and your rooms perimeter is " + perimeter + ".");

//      System.out.print("Enter the Length of your room: ");
//      String lengthV = scanner.nextLine();
//      int intLengthV = Integer.parseInt(lengthV);
//      System.out.print("Enter the Width of your room: ");
//      String widthV = scanner.nextLine();
//      double intWidthV = Integer.parseInt(widthV);
//      double areaV = intLengthV * intWidthV;
//      double perimeterV = (intLengthV + intWidthV) * 2;
//      System.out.print("If your room's length is " + lengthV + ", and your room's width is "
//              + widthV + "; your rooms area is " + areaV + ", and your rooms perimeter is " + perimeterV + ".");

   }
}

//        Hello there, codeup. Nice to see you.
//        Salutations, codeup!
//        The value of pi is approximately 3.14159.
//        Enter an integer: 10
//        Enter 3 words: i love pi
//        i
//        love
//        pi
//        i
//        love
//        pi
//        Enter a sentence: i love pi
//        i love pi
//        Enter the Length of your room: 10
//        Enter the Width of your room: 20
//        If your room's length is 10, and your room's width is 20; your rooms area is 200, and your rooms perimeter is 60.
//        Process finished with exit code 0