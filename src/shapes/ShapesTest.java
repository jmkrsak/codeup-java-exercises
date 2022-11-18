package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Square(3);
        Measurable myShape1 = new Rectangle(3, 4);

        Rectangle rectangle = new Rectangle(2,4);
        Square square = new Square(10);

        double recPer = rectangle.getPerimeter();
        double recAr = rectangle.getArea();
        double sqPer = square.getPerimeter();
        double sqAr = square.getArea();

        System.out.println(recPer);
        System.out.println(recAr);
        System.out.println(sqPer);
        System.out.println(sqAr);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myShape1.getArea());

//        Rectangle box1 = new Rectangle(4, 5);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    }

}
