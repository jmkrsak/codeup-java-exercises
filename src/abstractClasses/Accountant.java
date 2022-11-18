package abstractClasses;

public class Accountant extends Employee{

    public String work() {
        return "crunching some numbers";
    }

    public Accountant() {
        System.out.println("new accountant created");
    }

    public static void main(String[] args) {
        Employee bob = new Accountant();
    }

}
