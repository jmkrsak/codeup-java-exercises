package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {

//    Inside of shapes, create a class named CircleApp that
//    prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)

    public static void main(String[] args) {
        Input input = new Input(new Scanner(System.in));
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        System.out.printf("circumference and area are %f and %f",circle.getCircumference(radius), circle.getArea(radius));
    }

}
