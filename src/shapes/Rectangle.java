package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
//        this.length = length;
//        this.width = width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }


// ----- poly ex --------
//    protected int length;
//
//    protected int width;
//
////    public Rectangle() {
////    }
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
//
//    public int getArea() {
//        return length * width;
//    }

}
