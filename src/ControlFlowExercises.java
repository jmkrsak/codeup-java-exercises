import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 5;
        while (i <= 15) {
            System.out.println(i++);
        }

        int num = 0;
        do {
            System.out.println(num);
            num += 2;
        } while (num <= 100);

        int numTwo = 100;
        do {
            System.out.println(numTwo);
            numTwo -= 5;
        } while (numTwo >= -10);
        for (numTwo = 100; numTwo >= -10; numTwo -= 5) {
            System.out.println(numTwo);
        }

        long numThree = 2;
        do {
            System.out.println(numThree);
            numThree *= numThree;
        } while (numThree < 1000000);
        for (numThree = 2; numThree < 1000000; numThree *= numThree) {
            System.out.println(numThree);
        }

        for (int numFour = 1; numFour <= 100; numFour++) {
            if (numFour % 3 == 0 && numFour % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numFour % 5 == 0) {
                System.out.println("Buzz");
            } else if (numFour % 3 == 0) {
                    System.out.println("Fizz");
            } else {
                System.out.println(numFour);
            }
        }

        System.out.print("Please enter a number: ");
        int numFive = scanner.nextInt();
        System.out.println(numFive);
        for (int x = 0; x <= numFive; x++) {
            if (x == 0) {
                System.out.println("Here is your table!");
                System.out.println("number  | squared   | cubed  |");
            } else {
                System.out.format("%-6d\t| %-6.0f\t| %-6.0f | \n", x, Math.pow(x, 2), Math.pow(x, 3));
            }
        }



    }
}
