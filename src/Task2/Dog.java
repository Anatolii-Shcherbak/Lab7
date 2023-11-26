package Task2;

public class Dog extends Mammal {
    String eyecolor;

    public Dog(String name, int age, double weight, String SkinColour, String eyecolor ) {
        super(name, age, weight, SkinColour);
        this.eyecolor = eyecolor;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight +  ", SkinColour: " + SkinColour +  ", eyecolor: " + eyecolor ;
    }
}
