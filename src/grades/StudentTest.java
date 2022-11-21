package grades;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
//        ArrayList<Integer> grades1 = new ArrayList<>(){{
//            add(12);
//            add(50);
//            add(60);
//        }};
        Student testStudent = new Student("John", new ArrayList<>());
        testStudent.addGrade(10);
        testStudent.addGrade(20);
        testStudent.addGrade(30);
        testStudent.addGrade(40);
        System.out.println(testStudent.getGrades());
        System.out.println(testStudent.getGradeAverage(testStudent.getGrades()));
        System.out.println(testStudent.getStudentName());
        for(Integer i: testStudent.getGrades()) {
            System.out.println(i);
        }

    }

}
