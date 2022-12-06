package testPractice;

import java.util.ArrayList;

public class Assessment {

    public static double half(double num) {
        return num / 2;
    }

    public static String shout(String str) {
        return str.toUpperCase() + "!!!";
    }

    public static ArrayList<Animal> removeCats(ArrayList<Animal> arr) {
        String removeIt = "Felis catus";
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).getSpecies().equals(removeIt)) {
                arr.remove(i);
            }

        }

        return arr;

    }

    public static void main(String[] args) {

        Animal animal = new Animal("name", "species");
        System.out.println(animal.roar());
        System.out.println(half(11));
        System.out.println(shout("YoMama"));

    }

}
