package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

//    public String getString() {
//        System.out.print("type String here: ");
//        if (scanner.hasNextLine()) {
//            return scanner.nextLine();
//        } else {
//            scanner.nextLine();
//        }
//        return "";
//    }

    public String getString() {
        System.out.print("Type word(s) here: ");

        return scanner.nextLine();

    }

    public int getInt(String prompt) {
        if (!prompt.equals("")) {
            System.out.print(prompt);
        } else System.out.print("Type whole number here: ");

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            scanner.nextLine();
        }
        return 0;
    }

//    public int getInt() {
//        System.out.print("Type whole number here: ");
//
//        if (scanner.hasNextInt()) {
//            return scanner.nextInt();
//        } else {
//            scanner.next();
//            System.out.println("invalid input");
//            getInt();
//        }
//        int input = scanner.nextInt();
//        return input;
//    }

    public double getDouble() {
        System.out.print("Type decimal/radius here: ");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            scanner.nextLine();
        }
        return 0;
    }

//    public double getDouble() {
//        System.out.print("Type decimal number here: ");
//
//        return scanner.nextDouble();
//
//    }

//    public boolean yesNo() {
//        System.out.print("type yes or no here: ");
//        if (scanner.hasNextLine()) {
//            if (scanner.hasNext("y") || scanner.hasNext("Y") || scanner.hasNext("yes") || scanner.hasNext("Yes")) {
//                scanner.nextLine();
//                return true;
//            } else if (scanner.hasNext("n") || scanner.hasNext("N") || scanner.hasNext("no") || scanner.hasNext("No")) {
//                scanner.nextLine();
//                return false;
//            } else {
//                scanner.nextLine();
//                System.out.println("invalid input");
//                return false;
//            }
//        }
//        scanner.nextLine();
//        System.out.println("invalid input");
//        return false;
//    }

    public boolean yesNo() {
        System.out.print("Respond by typing (Y)es or (N)o here: ");

        if (scanner.hasNext("y") || scanner.hasNext("Y") || scanner.hasNext("yes") || scanner.hasNext("Yes")) {
                scanner.nextLine();
                return true;
        } else if (scanner.hasNext("n") || scanner.hasNext("N") || scanner.hasNext("no") || scanner.hasNext("No")) {
                scanner.nextLine();
                return false;
        } else {
                scanner.nextLine();
                System.out.println("invalid input");
                return false;
        }

    }

//    public int getInt(int min, int max) {
//        this.scanner.nextLine();
//        System.out.print("guess a number between an unknown min and max here: ");
//        if (scanner.hasNextInt()) {
//            int guessedNum = scanner.nextInt();
//            if (guessedNum >= min  && guessedNum <= max) {
//                System.out.printf("You guessed correctly, the min and max were: %d, and %d!%n",min,max);
//                return guessedNum;
//            } else {
//                System.out.printf("You have guessed incorrectly, try again!%n");
//                getInt(min, max);
//            }
//        }
//            return min - 1;
//    }

    public int getInt(int min, int max) {
        this.scanner.nextLine();
        System.out.print("Guess a whole number between an unknown min and max here: ");

        int guessedNum = scanner.nextInt();
        if (guessedNum >= min  && guessedNum <= max) {
                System.out.printf("You guessed correctly, the min and max were: %d, and %d!%n",min,max);

        } else {
            System.out.printf("You have guessed incorrectly, try again!%n");
//            getInt(min, max);
        }

        return guessedNum;
    }

//    public double getDouble(double min, double max) {
//        this.scanner.nextLine();
//        System.out.print("guess a number between an unknown min and max here: ");
//        if (scanner.hasNextDouble()) {
//            double guessedNum = scanner.nextDouble();
//            if (guessedNum >= min  && guessedNum <= max) {
//                System.out.printf("You guessed correctly, the min and max were: %f, and %f!%n",min,max);
//                return guessedNum;
//            } else {
//                System.out.printf("You have guessed incorrectly, try again!%n");
//                getDouble(min, max);
//            }
//        }
//        return 0;
//    }

    public double getDouble(double min, double max) {
        this.scanner.nextLine();
        System.out.print("Guess a decimal number between an unknown min and max here: ");

        double guessedNum = scanner.nextDouble();
        if (guessedNum >= min  && guessedNum <= max) {
            System.out.printf("You guessed correctly, the min and max were: %f, and %f!%n",min,max);

        } else {
            System.out.printf("You have guessed incorrectly, try again!%n");
            getDouble(min, max);
        }

        return guessedNum;
    }

    public static void main(String[] args) {
        Input input = new Input(new Scanner(System.in));
        System.out.println(input.getString());
        System.out.println(input.getInt(""));
        System.out.println(input.getDouble());
        System.out.println(input.yesNo());
//        System.out.println(input.getInt(10, 30));
        System.out.println(input.getDouble(.10, .20));

    }

}
