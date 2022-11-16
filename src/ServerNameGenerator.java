public class ServerNameGenerator {

    public static String[] nouns = {"House", "Dog", "America", "Cup", "Towel", "Bed", "Grape", "Phone", "Cat", "Tub"};

    public static String[] adjectives = {"Tough", "Angry", "Happy", "Sad", "Smart", "Funny", "Great", "Moody", "Crazy", "Hyper"};

    public static String randomElementFromArray(String[] strings) {
        int myRandomIndex = (int) Math.floor(Math.random() * strings.length);
        return strings[myRandomIndex];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your server name:\n%s-%s\n",randomElementFromArray(nouns),randomElementFromArray(adjectives));

    }

}
