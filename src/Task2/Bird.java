package Task2;

public class Bird extends Animal{
    String featherColor;
    @Override
    public void eat() {
    }

    @Override
    public String getVoice() {
        return null;
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight +  ", featherColor: " + featherColor ;
    }
}
