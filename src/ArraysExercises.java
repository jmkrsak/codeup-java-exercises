import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] persons, Person additionalPerson) {
        Person[] newPersonArray = new Person[persons.length + 1];
        newPersonArray[persons.length] = additionalPerson;
        return newPersonArray;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];

        persons[0] = new Person("Danny");
        persons[1] = new Person("John-Michael");
        persons[2] = new Person("Matthew");

        for(Person i : persons) {
            System.out.println(i.getName());
        }

    }

}
