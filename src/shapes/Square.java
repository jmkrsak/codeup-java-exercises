package shapes;

public class Square extends Rectangle {

    protected int side;

    public Square(int side) {
        super(side, side);
//        super.length = side;
//        super.width = side;
        this.side = side;
    }

    public int getPerimeter() {
        return 4 * side;
    }

    public int getArea() {
        return (int) Math.pow(side,2);
    }

}
