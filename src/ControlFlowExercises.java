import java.util.*;

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

//        5
//        6
//        7
//        8
//        9
//        10
//        11
//        12
//        13
//        14
//        15
//        0
//        2
//        4
//        6
//        8
//        10
//        12
//        14
//        16
//        18
//        20
//        22
//        24
//        26
//        28
//        30
//        32
//        34
//        36
//        38
//        40
//        42
//        44
//        46
//        48
//        50
//        52
//        54
//        56
//        58
//        60
//        62
//        64
//        66
//        68
//        70
//        72
//        74
//        76
//        78
//        80
//        82
//        84
//        86
//        88
//        90
//        92
//        94
//        96
//        98
//        100
//        100
//        95
//        90
//        85
//        80
//        75
//        70
//        65
//        60
//        55
//        50
//        45
//        40
//        35
//        30
//        25
//        20
//        15
//        10
//        5
//        0
//        -5
//        -10
//        100
//        95
//        90
//        85
//        80
//        75
//        70
//        65
//        60
//        55
//        50
//        45
//        40
//        35
//        30
//        25
//        20
//        15
//        10
//        5
//        0
//        -5
//        -10
//        2
//        4
//        16
//        256
//        65536
//        2
//        4
//        16
//        256
//        65536
//        1
//        2
//        Fizz
//        4
//        Buzz
//        Fizz
//        7
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz
//        16
//        17
//        Fizz
//        19
//        Buzz
//        Fizz
//        22
//        23
//        Fizz
//        Buzz
//        26
//        Fizz
//        28
//        29
//        FizzBuzz
//        31
//        32
//        Fizz
//        34
//        Buzz
//        Fizz
//        37
//        38
//        Fizz
//        Buzz
//        41
//        Fizz
//        43
//        44
//        FizzBuzz
//        46
//        47
//        Fizz
//        49
//        Buzz
//        Fizz
//        52
//        53
//        Fizz
//        Buzz
//        56
//        Fizz
//        58
//        59
//        FizzBuzz
//        61
//        62
//        Fizz
//        64
//        Buzz
//        Fizz
//        67
//        68
//        Fizz
//        Buzz
//        71
//        Fizz
//        73
//        74
//        FizzBuzz
//        76
//        77
//        Fizz
//        79
//        Buzz
//        Fizz
//        82
//        83
//        Fizz
//        Buzz
//        86
//        Fizz
//        88
//        89
//        FizzBuzz
//        91
//        92
//        Fizz
//        94
//        Buzz
//        Fizz
//        97
//        98
//        Fizz
//        Buzz
//        Please enter a number: 1
//        1
//        Here is your table!
//        number  | squared   | cubed  |
//        1     	| 1     	| 1      |
//        Enter your numerical grade here: 10
//        F
//        Do you have another grade to submit? [y / n]: y
//        Enter your numerical grade here: 20
//        F
//        Do you have another grade to submit? [y / n]: y
//        Enter your numerical grade here: 30
//        F
//        Do you have another grade to submit? [y / n]: n
//        Enter your numerical grade here: 10
//        F
//        Do you have another grade to submit? [y / n]: y
//        Enter your numerical grade here: 20
//        F
//        Do you have another grade to submit? [y / n]: y
//        Enter your numerical grade here: 30
//        F
//        Do you have another grade to submit? [y / n]: n
//        20
//        F
