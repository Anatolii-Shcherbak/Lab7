package Task2;

public class Pigeon extends Bird {
    String species;

    public Pigeon(String name, int age, double weight, String featherColor,  String species ) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight +  ", featherColor: " + featherColor +  ", species: " + species ;
    }
}
