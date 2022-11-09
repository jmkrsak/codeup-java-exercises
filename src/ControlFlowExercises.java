import java.sql.Array;
import java.util.*;

import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static String calcLetterGrade(int grade) {
        if (grade >= 88) {
            return ("A");
        } else if (grade >= 80 && grade <= 87) {
            return ("B");
        } else if (grade >= 67 && grade <= 79) {
            return ("C");
        } else if (grade >= 60 && grade <= 66) {
            return ("D");
        } else {
            return ("F");
        }
    }
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

        boolean submitGradeOne = true;
        while (submitGradeOne) {

            System.out.print("Enter your numerical grade here: ");
            int numSix = scanner.nextInt();
            scanner.nextLine();

            if (numSix >= 88) {
                System.out.println("A");
            } else if (numSix >= 80 && numSix <= 87) {
                System.out.println("B");
            } else if (numSix >= 67 && numSix <= 79) {
                System.out.println("C");
            } else if (numSix >= 60 && numSix <= 66) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.print("Do you have another grade to submit? [y / n]: ");
            String answerTwo = scanner.nextLine();
            if (answerTwo.equalsIgnoreCase("y")) {
                submitGradeOne = true;
            } else {
                submitGradeOne = false;
            }
        }

            List<Integer> myList = new ArrayList<Integer>();

            boolean submitGrade = true;
            while (submitGrade) {

                System.out.print("Enter your numerical grade here: ");
                int numSeven = scanner.nextInt();
                scanner.nextLine();

                System.out.println(calcLetterGrade(numSeven));


                System.out.print("Do you have another grade to submit? [y / n]: ");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    myList.add(numSeven);
                    submitGrade = true;
                } else {
                    myList.add(numSeven);
                    Optional<Integer> newGrade = myList.stream().reduce((a, b) -> {return a + b;} );
                    System.out.println(newGrade.get() / myList.size());
                    System.out.println(calcLetterGrade(newGrade.get() / myList.size()));
                    submitGrade = false;
                }

        }
    }
}
