package unit2;

class Vehicle {
    String regNo;
    String color;
    String typeOfVehicle;

    Vehicle(String r, String c, String t) {
        regNo = r;
        color = c;
        typeOfVehicle = t;
    }

    void display() {
        System.out.println("Registration No: " + regNo);
        System.out.println("Color: " + color);
        System.out.println("Type of Vehicle: " + typeOfVehicle);
    }
}

// ---------------- CAR CLASS ----------------
class Car extends Vehicle {
    int makeYear;
    String fuel;

    Car(String r, String c, String t, int m, String f) {
        super(r, c, t);
        makeYear = m;
        fuel = f;
    }

    void display() {
        System.out.println("\nCar Details:");
        super.display();
        System.out.println("Making Year: " + makeYear);
        System.out.println("Fuel Type: " + fuel);
    }
}

// ---------------- TRUCK CLASS ----------------
class Truck extends Vehicle {
    int maxLoad;
    String fuel;

    Truck(String r, String c, String t, int m, String f) {
        super(r, c, t);
        maxLoad = m;
        fuel = f;
    }

    void display() {
        System.out.println("\nTruck Details:");
        super.display();
        System.out.println("Max Load Capacity: " + maxLoad + " tons");
        System.out.println("Fuel Type: " + fuel);
    }
}

// ---------------- MOTORCYCLE CLASS ----------------
class Motorcycle extends Vehicle {
    int makeYear;
    int cc;
    String fuel;

    Motorcycle(String r, String c, String t, int m, int ccap, String f) {
        super(r, c, t);
        makeYear = m;
        cc = ccap;
        fuel = f;
    }

    void display() {
        System.out.println("\nMotorcycle Details:");
        super.display();
        System.out.println("Making Year: " + makeYear);
        System.out.println("Cubic Capacity: " + cc + " CC");
        System.out.println("Fuel Type: " + fuel);
    }
}

// ---------------- MAIN CLASS ----------------
public class VehicleDemo {
    public static void main(String[] args) {

        Car c1 = new Car("MH12AB1234", "Red", "Car", 2021, "Petrol");
        Truck t1 = new Truck("MH14CD5678", "Blue", "Truck", 10, "Diesel");
        Motorcycle m1 = new Motorcycle("MH15EF9012", "Black", "Motorcycle", 2022, 200, "Petrol");

        c1.display();
        t1.display();
        m1.display();
    }
}
