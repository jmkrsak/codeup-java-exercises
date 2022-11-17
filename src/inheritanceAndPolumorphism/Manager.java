package inheritanceAndPolumorphism;

public class Manager extends Employee {

    public Manager (String managerName, String managerTitle){
        super(managerName, managerTitle);

    }

    public String work() {
        return "managing employees";
    }

    public static void main(String[] args) {
        Manager x = new Manager("John", "Awesome Manager");
        System.out.println("[Manager Class] manager x's name is: " + x.name + " and their job title is " + x.jobTitle);

        x.doWork(x);
    }

}
