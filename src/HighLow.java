import java.util.Scanner;

public class HighLow {

    public static int getRandom() {

        double randomNum = Math.floor(Math.random()*100 + 1);

        return (int) randomNum;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNum = getRandom();
        int count = 0;

        do {

            System.out.println("Guess a number between 1 and 100: ");
            int guessNum = scanner.nextInt();
            scanner.nextLine();
            if (randomNum == guessNum) {
                System.out.println(guessNum + " is correct!");
                count = 10;
            } else if (randomNum > guessNum) {
                System.out.println(guessNum + " is too low!");
                count++;
            } else if (randomNum < guessNum) {
                System.out.println(guessNum + " is too high!");
                count++;
            }

        } while (count < 10);
    }
}
