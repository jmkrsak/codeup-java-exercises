import java.util.Arrays;

public class ArraysExercises {

    private Person[] myPersons;

    public void addPerson(Person[] persons, Person additionalPerson) {
        Person[] newPersonArray = new Person[persons.length + 1];
        newPersonArray[newPersonArray.length - 1] = additionalPerson;
        this.myPersons = newPersonArray;
    }


    public ArraysExercises() {
        this.myPersons = new Person[] {
        new Person("Danny"),
        new Person("John-Michael"),
        new Person("Matthew")
        };
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        Person[] persons = new Person[3];



        for(Person i : persons) {
            System.out.println(i.getName());
        }

        ArraysExercises exercises = new ArraysExercises();
        System.out.println(exercises.myPersons.length);
        exercises.addPerson();

        Person persons1 = new Person("Timmy");



        for(Person i : persons) {
            System.out.println(i.getName());
        }

    }

}
