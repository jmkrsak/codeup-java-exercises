package inheritanceAndPolumorphism;

public class Person2 {
    protected String name;

    public Person2(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("[Person Class] Hello from!");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person2 a = new Person2("Mario");
        a.sayHello();

        System.out.println("[Person Class] person a's name is: " + a.name);
    }

}
