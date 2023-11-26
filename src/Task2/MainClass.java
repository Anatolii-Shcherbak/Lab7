package Task2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Some Mammal", 5, 10.0, "Gray");
        animal[1] = new Dog("vlad", 5, 5.0, "Brown", "Blue");
        animal[2] = new Bird("kik", 5, 3.0, "f");
        animal[3] = new Pigeon("dvld", 5, 4.0, "f", "idk");
        animal[4] = new Fish("dvd", 5, 2.0, "f");
        animal[5] = new Blowfish("qe", 5, 4.0, "f", 3);

        animal[0].getVoice();

        for(int i = 0; i<animal.length; i++) {
            System.out.println(animal[i]);
        }
    }
}