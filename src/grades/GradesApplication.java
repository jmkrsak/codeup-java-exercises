package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void lookUpStudent() {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Student> studentHash = new HashMap<>();

        Student student1 = new Student("John", new ArrayList<>());
        studentHash.put("@john1", student1);
        student1.addGrade(10);
        student1.addGrade(20);
        student1.addGrade(30);
        student1.addGrade(40);

        Student student2 = new Student("Jasmine", new ArrayList<>());
        studentHash.put("@jas1", student2);
        student2.addGrade(10);
        student2.addGrade(20);
        student2.addGrade(30);
        student2.addGrade(40);

        Student student3 = new Student("Juice", new ArrayList<>());
        studentHash.put("@juice1", student3);
        student3.addGrade(10);
        student3.addGrade(20);
        student3.addGrade(30);
        student3.addGrade(40);

        Student student4 = new Student("Sunny", new ArrayList<>());
        studentHash.put("@sunny1", student4);
        student4.addGrade(10);
        student4.addGrade(20);
        student4.addGrade(30);
        student4.addGrade(40);

        System.out.print("Here are the GitHub usernames of our students: \n");

        for(String i: studentHash.keySet()) {
            System.out.print("| " + i + " |  ");
        }

        System.out.print("\nWhat user would you like to see more information about?: ");

        String userInput = scanner.nextLine();

        if (studentHash.containsKey(userInput)) {
            System.out.println("Name: " + studentHash.get(userInput).getStudentName() + " - GitHub Username: " + userInput +
                    "\nCurrent Average: " + studentHash.get(userInput).getGradeAverage(studentHash.get(userInput).getGrades()));
        } else {
            System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\".");
        }

        yesNo();

    }

    public static void yesNo() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to see another student?: ");

        if (scanner.hasNext("y") || scanner.hasNext("Y") || scanner.hasNext("yes") || scanner.hasNext("Yes")) {
            scanner.nextLine();
            lookUpStudent();
        } else if (scanner.hasNext("n") || scanner.hasNext("N") || scanner.hasNext("no") || scanner.hasNext("No")) {
            scanner.nextLine();
        } else {
            scanner.nextLine();

            yesNo();

        }

    }

    public static void main(String[] args) {

        lookUpStudent();

    }

}
