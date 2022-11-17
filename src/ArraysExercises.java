import java.util.Arrays;

public class ArraysExercises {

    private Person[] myPersons;

    public void addPerson(Person[] persons, Person additionalPerson) {
        Person[] newPersonArray = new Person[persons.length + 1];
        for(int per = 0; per < persons.length; per++) {
            newPersonArray[per] = persons[per];

        }
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

        Person persons1 = new Person("Timmy");

        ArraysExercises exercises = new ArraysExercises();

        for(Person per : exercises.myPersons) {
            System.out.println(per.getName());
        }

        exercises.addPerson(exercises.myPersons, persons1);

        for(Person per : exercises.myPersons) {
            System.out.println(per.getName());
        }

    }

}
