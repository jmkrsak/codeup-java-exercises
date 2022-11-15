import java.util.Scanner;

public class ConsExer {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int thisNum = scanner.nextInt();
        System.out.println(thisNum);

        scanner.nextLine();

        System.out.print("enter 3 words: ");
        String oneWord = scanner.next();
        String twoWords = scanner.next();
        String threeWords = scanner.next();
        System.out.println(oneWord);
        System.out.println(twoWords);
        System.out.println(threeWords);

        scanner.nextLine();

        System.out.print("enter a new sentence: ");
        String yourSentence = scanner.nextLine();
        System.out.println(yourSentence);

        System.out.print("enter your rooms length: ");
        String length = scanner.next();
        int intLength = Integer.parseInt(length);
        System.out.print("enter your rooms width: ");
        String width = scanner.next();
        int intWidth = Integer.parseInt(width);
        int area = intLength * intWidth;
        int perimeter = (intLength * 2) + (intWidth * 2);
        System.out.printf("the area and perimeter are of your room is %d and %d",area,perimeter);

    }

}
