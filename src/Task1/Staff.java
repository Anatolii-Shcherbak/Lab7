package Task1;

import java.util.Scanner;

public class Staff extends Person{
    String education, pozition;
    Scanner scan = new Scanner(System.in);

    public void initialize1()
    {
        initialize();
        System.out.println("Write Education");
        education = scan.nextLine();
        System.out.println("Write Pozition");
        pozition = scan.nextLine();
    }

    public void print1()
    {
        print();
        System.out.println(education + " " + pozition);
    }
}
