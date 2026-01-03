package unit2;

import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);

    public int age;
    public String name, city;

    public void addData() {
        System.out.println("\nAdd Data");

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter City: ");
        city = sc.next();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }

    public void printData() {
        System.out.println("\nPrint Data");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}

public class PC2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.addData();
        s1.printData();

        s2.addData();
        s2.printData();
    }
}
