package Task1;

import java.util.Scanner;

public class Person {
    String surname, firstname, street, zipCode, city;
    Scanner scan = new Scanner(System.in);


    public void initialize()
    {
        System.out.println("Write Surname");
        surname = scan.nextLine();
        System.out.println("Write Name");
        firstname = scan.nextLine();
        System.out.println("Write Street");
        street = scan.nextLine();
        System.out.println("Write zipCode");
        zipCode = scan.nextLine();
        System.out.println("Write City");
        city = scan.nextLine();
    }

    public void print()
    {
        System.out.println(surname + " " + firstname + " " + street + " " + zipCode + " " + city);
    }
}