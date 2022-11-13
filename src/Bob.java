import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean talkToTeen = true;

        while (talkToTeen) {

            System.out.print("What would you like to say to Bob?: ");
            String input = scanner.nextLine();

            if (input.endsWith("?") == true) {
                System.out.println("Sure.");
            } else if (input.endsWith("!") == true) {
                System.out.println("Whoa, chill out!");
            } else if (input.trim().length() == 0) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.print("Anything else you need from me old timer? [y / n]: ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                talkToTeen = true;
            } else {
                talkToTeen = false;
            }

        }

    }

}
