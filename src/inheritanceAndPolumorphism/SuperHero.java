package inheritanceAndPolumorphism;

public class SuperHero extends Person2{

    public SuperHero(String superHeroName, String alterEgo) {
        super(superHeroName);
        this.alterEgo = alterEgo;
    }

    public String getName(){
        return alterEgo;
    }

    private String alterEgo;

    public String getSecretIdentity() {
        return super.getName();
    }

    public static void main(String[] args) {

        SuperHero k = new SuperHero("logan", "wolverine");

        System.out.println("[SuperHero Class] superhero k's name is: " + k.name + " alterego is: " + k.alterEgo);
        k.sayHello();
        System.out.println("[SuperHero Class] getName -> " + k.getSecretIdentity());
    }

}
