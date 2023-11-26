package Task2;

public class Blowfish extends Fish {
    int lifeExpectancy;

    public Blowfish(String name, int age, double weight, String tribe, int lifeExpectancy ) {
        super(name, age, weight, tribe);
        this.lifeExpectancy = lifeExpectancy;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight +  ", tribe: " + tribe +  ", lifeExpectancy: " + lifeExpectancy ;
    }
}
