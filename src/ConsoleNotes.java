import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleNotes {

    public static void singASong(String what, String where) {

        System.out.printf("The %s at night are big and bright deep in the heart of %s%n", what, where);

    }

    public static int addNums(int x, int y, int z) {
        return x + y + z;

    }

    public static double addNums(double x, double y, double z) {
        return x + y + z;

    }

    public static int addNums(String x, String y, String z) {
        return parseInt(x) + parseInt(y) + parseInt(z);

    }

//    public static void changeString (String[] args) {
//
//    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        singASong("bars", "New Orleans");
        singASong("casinos", "Las Vegas");

        System.out.println("addNums(2, 4, 6)  = " + addNums(2, 4, 6));
        System.out.println("addNums(2.5, 4.5, 6.5)  = " + addNums(2.5, 4.5, 6.5));
        System.out.println("addNums(2.5, 4.5, 6.5)  = " + addNums("2", "4", "6"));

        String starsStringVar = "stars";
        String texasNameVar = "Texas";

        singASong(starsStringVar, texasNameVar);

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

//        int num;
//        for (num = 30; num <= 50; num += 2) {
//            System.out.println("num is: " + num);
//        }
//        System.out.println(num);

//        String myName = "Kenneth";
//        String myName2 = "Kenneth";
//        System.out.println("myName = myName2 = " + (myName == myName2));
//        System.out.println(myName.equals(myName2));
//
//        System.out.println("myName.startsWith(\"Kenny\") = " + myName.startsWith("Kenny"));
//        System.out.println("myName.endsWith(\"net\") = " + myName.endsWith("net"));
//        System.out.println("myName.equalsIgnoreCase(\"KENNETH\") = " + myName.equalsIgnoreCase("KENNETH"));
//        System.out.println("myName.startsWith(\"Ken\") = " + myName.startsWith("Ken"));
//        System.out.println("myName.endsWith(\"eth\") = " + myName.endsWith("eth"));
//
//        String myState = "Texas is my State";
//        System.out.println("myState.charAt(2) = " + myState.charAt(2));
//        System.out.println("myState.indexOf(\"Tex\") = " + myState.indexOf("Tex"));
//        System.out.println("myState.indexOf(\"ex\") = " + myState.indexOf("ex"));
//        System.out.println("myState.indexOf(\"s\") = " + myState.indexOf("s"));
//
//        System.out.println("myState.lastIndexOf(\"x\") = " + myState.lastIndexOf("a"));
//
//        System.out.println("myState.length() = " + myState.length());
//
//        System.out.println("myState.replace() = " + myState.replace("T", "Z"));
//
//        String myStateTwo = myState.substring(4, 10);
//        System.out.println(myStateTwo);
//
//        System.out.println(myState.toLowerCase());
//        System.out.println(myState.toUpperCase());
//
//        String userName = "        ken2cool        ";
//        System.out.println("userName.length() [BEFORE TRIM] = " + userName.length());
//        System.out.println("userName.length() [AFTER TRIM] = " + userName.trim().length());



    }
}
