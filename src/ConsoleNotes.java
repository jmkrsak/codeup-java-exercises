import java.util.Scanner;

public class ConsoleNotes {
    public static void main(String[] args) {
//        String name = "laura";
//        int age = 32;
//        String lastName = "Ruiz";
//        System.out.println(name);
//        System.out.println("my name is " + name);
//        System.out.printf("Hello %s, is your last name %s? Are you really %d?%n", name, lastName, age);
//
//        Scanner myScanner = new Scanner(System.in);
//
//        System.out.print("enter your city: ");
//        String userInput = myScanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//        System.out.print("enter your age: ");
//        int userAge = myScanner.nextInt();
//        System.out.println("You entered: --> \"" + userAge + "\" <--");
//
//        myScanner.nextLine();
//
//        System.out.print("favorite restaurant: ");
//        String faveRes = myScanner.nextLine();
//        System.out.println("You entered: --> \"" + faveRes + "\" <--");

        Scanner scanner = new Scanner(System.in);

//        int a = 28;
//        int b = 30;
//        int c = 12;
//        short d = 5;
//        int e = 500;
//        long f = 500;
//
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a >= b);
//        System.out.println(a <= b);
//        System.out.println(e == f);

//        int age = 33;
//        System.out.print("Guess my age: ");
//        int guessAge = scanner.nextInt();
//        System.out.println("The age you guessed is : " + (guessAge == age) + "!");
//
//        boolean bringSweater = false;
//        boolean bringSunnies = false;
//        System.out.println("what is the current temp?");
//        int currentTemp = scanner.nextInt();
//        String outfit = "today i'm wearing: ";
//
//        if(currentTemp > 75) {
//            bringSunnies = true;
//            bringSweater = false;
//        } else {
//            bringSweater = true;
//            bringSunnies = false;
//        }
//
//        if(bringSunnies == true && bringSweater == false) {
//            outfit += " my favorite pair of sunnies!";
//        } else if(bringSunnies == true || bringSunnies == true) {
//            outfit += " i'm also bringing my sweater and maybe my sunnies!";
//        }
//        System.out.println(outfit);

//        String passCode = "superPassCode";
//        System.out.println("hey what's the passcode?");
//        String userPass = scanner.nextLine();
//        System.out.println("hey how old are you?");
//        int userAge = scanner.nextInt();
//
//        System.out.println(passCode + " <-- pass | userInput --> " + userPass + "<<" + userAge + ">>");
//
//        if(passCode.equals(userPass) && userAge > 21) {
//            System.out.println("congrats thats the pass!");
//        } else {
//            System.out.println("sorry thats not it champ! try again");
//        }

//        String passCode = "superPassCode";
//        System.out.println("hey what's the passcode?");
//        String userPass = scanner.nextLine();
//        System.out.println("hey how old are you?");
//        int userAge = scanner.nextInt();
//
//        System.out.println(passCode + " <-- pass | userInput --> " + userPass + "<<" + userAge + ">>");
//
//        if(!passCode.equals(userPass) && userAge > 21) {
//            System.out.println("congrats thats the pass!");
//        } else {
//            System.out.println("sorry thats not it champ! try again");
//        }

//        String passCode = "superPassCode";
//        System.out.println("hey what's the passcode?");
//        String userPass = scanner.nextLine();
//        System.out.println("hey how old are you?");
//        int userAge = scanner.nextInt();
//
//        System.out.println(passCode + " <-- pass | userInput --> " + userPass + "<<" + userAge + ">>");
//
//        if(passCode.equals(userPass) && userAge > 21) {
//            System.out.println("congrats thats the pass!");
//        } else {
//            System.out.println("sorry thats not it champ! try again");
//        }

//        int caseSwitch = 2;
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("case 1");
//            case 2:
//                System.out.println("case 2");
//                break;
//            default:
//                System.out.println("default case");
//                break;
//        }

//        int i = 0;
//        while(i < 10) {
//            System.out.println("i is: " + i);
//            i++;
//        }

//        int i = 0;
//        do{
//            System.out.println("i is: " + i);
//            i++;
//        } while (i < 10);

//        for (int i = 0; i <= 10; i++) {
//            System.out.println("i is: " + i);
//        }


//        for (int num = 30; num <= 50; num += 2) {
//            System.out.println("num is: " + num);
//        }

        int num;
        for (num = 30; num <= 50; num += 2) {
            System.out.println("num is: " + num);
        }
        System.out.println(num);

    }
}
