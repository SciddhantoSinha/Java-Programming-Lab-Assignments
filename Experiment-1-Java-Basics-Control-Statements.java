package unit1;

import java.util.Scanner;

public class PEL {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int num1 = input.nextInt();

        System.out.println("Enter Number 2: ");
        int num2 = input.nextInt();

        System.out.println("Enter Number 3: ");
        int num3 = input.nextInt();

        System.out.println("Enter Number 4: ");
        int num4 = input.nextInt();

        if ((num1 == num2) && (num2 == num3) && (num3 == num4)) {
            System.out.println("ALL NUMBERS ARE EQUAL");
        } else {
            System.out.println("NUMBERS ARE UNEQUAL");
        }

        input.close();
    }
}
