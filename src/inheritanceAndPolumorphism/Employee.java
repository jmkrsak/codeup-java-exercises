package inheritanceAndPolumorphism;

class Employee extends Person2{

    public String jobTitle;

    public Employee(String employeeName, String title) {
        super(employeeName);
        this.jobTitle = title;
    }

    public String work() {
        return "filling out reports";
    }

    public void doWork(Employee e) {
        System.out.println(e.work());
        System.out.println("[Employee Class] doWork(): " + e.work());
    }




    public static void main(String[] args) {
        Employee y = new Employee("Joseph", "Software Engineer");
        System.out.println("[Employee Class] employee y's name is: " + y.name + ", and their job title is: " + y.jobTitle);

        y.doWork(y);

    }

}
