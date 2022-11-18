package abstractClasses;

abstract class Employee {

//    abstracts do not have constructors
//    public Employee(String name, String department) {
//        this.name = name;
//        this.department = department;
//    }

    public abstract String work();

    protected String name;
    protected String department;

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

            Employee bob = new Accountant();
            bob.work();

    }

}
