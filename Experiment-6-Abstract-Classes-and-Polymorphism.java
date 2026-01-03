package unit3;

// ---------------- Abstract Class ----------------
abstract class Shape {
    int a, b;

    abstract void printArea();
}

// ---------------- Rectangle Class ----------------
class Rectangle extends Shape {

    void printArea() {
        int length = 5;
        int breadth = 4;
        System.out.println("AREA of Rectangle = " + (length * breadth));
    }
}

// ---------------- Triangle Class ----------------
class Triangle extends Shape {

    void printArea() {
        double base = 4;
        double height = 2;
        System.out.println("AREA of Triangle = " + (base * height) / 2);
    }
}

// ---------------- Circle Class ----------------
class Circle extends Shape {

    void printArea() {
        double radius = 5;
        System.out.println("AREA of Circle = " + (3.14 * radius * radius));
    }
}

// ---------------- Main Class ----------------
public class PE2 {
    public static void main(String[] args) {

        Shape s;

        s = new Rectangle();
        s.printArea();

        s = new Triangle();
        s.printArea();

        s = new Circle();
        s.printArea();
    }
}
