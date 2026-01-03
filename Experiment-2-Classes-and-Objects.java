package unit1;

public class Student {
    public static void main(String[] args) {

        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        s1.getData(101, "Kavya");
        s2.getData(102, "Bhavesh");

        s1.printData();
        s2.printData();
    }
}

class Student2 {
    int rollno;
    String name;

    public void getData(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public void printData() {
        System.out.println("Roll No is " + rollno + " and Name is " + name);
    }
}
