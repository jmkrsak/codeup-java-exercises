package shapes;

public class Square extends Quadrilateral {

    protected double side;

    public Square(double side) {
        super(side, side);
//        super.length = side;
//        super.width = side;
//        this.side = side;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

// ----- poly ex ----------
//    protected int side;
//
//    public Square(int side) {
//        super(side, side);
////        super.length = side;
////        super.width = side;
//        this.side = side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * this.side;
//    }
//
//    @Override
//    public int getArea() {
//        return (int) Math.pow(this.side,2);
//    }

}
