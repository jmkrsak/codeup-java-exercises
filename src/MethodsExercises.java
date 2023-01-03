import java.util.Scanner;

public class MethodsExercises {

    public static int addition (int x, int y) {
        return x + y;
    }

    public static int subtraction (int x, int y) {
        return x - y;
    }

    public static int multiplication (int x, int y) {
        return x * y;
    }

    public static double division (double x, double y) {
        return x / y;
    }

    public static int modulus (int x, int y) {
        return x % y;
    }

    public static int validateUserInput (int min, int max) {
        String thanksForPlaying = "Thanks for playing";
        System.out.println("Guess a number that's within my range: ");
        Scanner scanner = new Scanner(System.in);
        int numGuessed = scanner.nextInt();
        scanner.nextLine();
        if (numGuessed <= max && numGuessed >= min) {
            System.out.printf("The number %d is in the %d - %d range!", numGuessed, min, max);
        } else {
            System.out.println("This number is not in range");
            validateUserInput(min, max);
        }
        return numGuessed;
    }

    public static String getFactorial(int n1, int n2) {
        boolean hold = false;
        int input;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input > n1 && input < n2) {
                    int total = 1;
                    for (int i = 1; i <= input; i++) {
                        total *= i;
                        System.out.println(total);
                    }
                    return "input";
                } else hold = false;
            } else hold = false;
        }
        while (hold == false);
        return "0";
    }

    public static int getRandom(int num) {
        double rando = Math.floor(Math.random()*num+1);
        return (int) rando;
    }

    public static void rollDice() {
        String userInput = "y";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number for the sides of dice to roll: ");
            int numberSides = scanner.nextInt();
//        scanner.nextLine();
            int roll1 = getRandom(numberSides);
            int roll2 = getRandom(numberSides);
            int total = roll1 + roll2;
            System.out.println("This is the combination of two dice rolls of " + numberSides + " sided die for a total of " + total);
            System.out.print("Would you like to continue [Y/N]: ");
            userInput = scanner.next();
        } while (userInput.equalsIgnoreCase("y"));
    }

    public static void main(String[] args) {

        System.out.println("addition(10 + 20) = " + addition(10, 20));
        System.out.println("subtraction(10 - 20) = " + subtraction(10, 20));
        System.out.println("multiplication(10 * 20) = " + multiplication(10, 20));
        System.out.println("division(10 / 20) = " + division(10, 20));
        System.out.println("modulus(10 % 20) = " + modulus(10, 20));

        int newInput = validateUserInput(20, 30);
        System.out.println();
        System.out.println(newInput);

        getFactorial(1, 10);

        rollDice();

    }

}
