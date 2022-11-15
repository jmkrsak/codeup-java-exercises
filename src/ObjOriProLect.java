public class ObjOriProLect {

    // Filled out a character sheet
    // name, haircolor, age, attributes,

    // set up varible fields

    String name;
    String hairColor;
    int age;

    // make a method as a field

    public void sayHi() {
        System.out.printf("Hey it's %s! They are %d years old %n", name, age);
    }

    // to make an instance of a person obj we need a constructor

    // static vs instance
    // instance is unique data
    // static belongs to the class

    static long worldPop = 7_999_512_370L;

    //public constructor
//    public ObjOriProLect() {
//
//    }

    public ObjOriProLect() {

    };

    //configure a constructor
//    public ObjOriProLect(String parameterName) {
//        this.name = parameterName;
//
//        System.out.println("Congrats a new person was born! Their name is: " + this.name);
//
//    }

    // lets call a constructor inside of itself

    public ObjOriProLect(String name) {

        this(name, 0);

        System.out.println("Congrats a new person was born! Their name is: " + this.name);
    }

    public ObjOriProLect(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // i have fields name haircolor age
        // i have a defult constructor

//        ObjOriProLect kenneth = new ObjOriProLect();
//
//        kenneth.name = "Kenneth Howell";
//        kenneth.hairColor = "brown-ish";
//        kenneth.age = 34;
//
//        System.out.println("kenneth.name = " + kenneth.name);
//        System.out.println("kenneth.hairColor = " + kenneth.hairColor);
//        System.out.println("kenneth.age = " + kenneth.age);
//
//        kenneth.sayHi();
//
        ObjOriProLect johnny = new ObjOriProLect();

        johnny.name = "Johnny John";
        johnny.hairColor = "brown";
        johnny.age = 33;

        System.out.println("johnny.name = " + johnny.name);
        System.out.println("johnny.hairColor = " + johnny.hairColor);
        System.out.println("johnny.age = " + johnny.age);

        johnny.sayHi();

        // this wont work ObjOriProLect.name

//        System.out.println("The world pop is " + ObjOriProLect.worldPop);
//
//        System.out.println("Before Bob " + worldPop);
//
//        ObjOriProLect favPainter = new ObjOriProLect();
//
//        favPainter.name = "Bob Ross";
//        ObjOriProLect.worldPop++;
//
//        System.out.println("After Bob " + ObjOriProLect.worldPop);

        System.out.printf("%n%n%n");

        ObjOriProLect one = new ObjOriProLect("Danny");
        ObjOriProLect two = new ObjOriProLect("Riley", 30);
        ObjOriProLect three = new ObjOriProLect("Matthew");

        System.out.printf("Hey yall i made 3 new people: %s, %s, %s!%n", one.name, two.name, three.name);

        System.out.println(one.age + "? Do i know how old riley is?" + three.age);

        ObjOriProLect kennyKen = new ObjOriProLect("Mid-Thirties Ken", 34);
        System.out.println(kennyKen.age + " is how old kennyKen is. We expect this to be 34");
    }

}
