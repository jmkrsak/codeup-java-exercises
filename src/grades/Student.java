package grades;

//Create a Student class

import java.util.ArrayList;
import java.util.List;

public class Student {

    //Create a class named Student. It should have private properties for the student's name, and grades.

    private String studentName;

    // The grades property should be an ArrayList of integers.

    private ArrayList<Integer> grades;

    // The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.

    public Student() {

    }

    public Student(String studentName, ArrayList<Integer> grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    // The Student class should have the following methods:

    // returns the student's name
    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(List <Integer> grades) {
        if (grades == null || grades.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
//        return grades.stream().mapToDouble(i -> i).average().orElse(0);
    }



}
