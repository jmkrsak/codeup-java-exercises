import java.util.ArrayList;
import java.util.HashMap;

public class Collectioins {

    public static void main(String[] args) {

        // ARRAY LIST

        // Array list rules:
        // can change size
        // all elements must be obj
        // all elements must be of the same data type

        // Array list Syntax:
        // ArrayList<data type here> nameOfArrayList = new ArrayList<>();

        ArrayList<String> favoriteThanksgivingFoods = new ArrayList<>();
        System.out.println(favoriteThanksgivingFoods);

        favoriteThanksgivingFoods.add("Bread Rolls");
        System.out.println(favoriteThanksgivingFoods);

        favoriteThanksgivingFoods.add(0, "Trukey");
        System.out.println(favoriteThanksgivingFoods);

        favoriteThanksgivingFoods.add("Cranberry Sauce");
        System.out.println(favoriteThanksgivingFoods);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        System.out.println(numbers);

        // How to check the size
        numbers.add(18);
        numbers.add(28);
        numbers.add(38);
        System.out.println("----size----" + numbers.size());

        // Return specific element
        System.out.println(numbers.get(2));

        // Return the index of an element
        System.out.println(numbers.indexOf(38));

        // HASH MAP
        // key value pairs
        // values must be the same data type
        // keys must be the same data type

        // Hash Map Syntax
        HashMap<String, String> fifaThings = new HashMap<>();
        System.out.println(fifaThings);

        // ADD
        fifaThings.put("GroupA", "Ecuador");
        System.out.println(fifaThings);

        fifaThings.put("GroupB", "England");
        fifaThings.put("GroupC", "Korea");
        fifaThings.put("GroupD", "TBD");

        // GET
        System.out.println(fifaThings.get("GroupB"));
        System.out.println(fifaThings.containsValue("USA"));
        System.out.println(fifaThings.containsKey("GroupC"));

        fifaThings.remove("GroupD");
        System.out.println(fifaThings);

        fifaThings.putIfAbsent("GroupD", "TBD");
        System.out.println(fifaThings);

        fifaThings.replace("GroupD", "Argentina");
        System.out.println(fifaThings);





    }

}
