package shapes;

public class Circle {

//    Inside of src, create a package named shapes.
//    Inside of shapes, create a class named Circle.
//    This class should have a private radius field


    private double radius;

    //    that is set through the constructor, and various methods for getting information about the circle, detailed below.

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

}
