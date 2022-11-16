public class Person {

    private String name;

    public Person() {

    }

    public Person(String personName) {
        this.name = personName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + getName());
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Michael");
        System.out.println(person.name);
        System.out.println(person.getName());
        person.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

    }

}
