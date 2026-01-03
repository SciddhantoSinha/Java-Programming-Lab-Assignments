package unit3;

import java.util.Random;

// ---------------- Random Number Thread ----------------
class RandomNumberThread extends Thread {

    public void run() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomInt = random.nextInt(100);
            System.out.println("\nRandom Number: " + randomInt);

            if (randomInt % 2 == 0) {
                SquareThread st = new SquareThread(randomInt);
                st.start();
            } else {
                CubeThread ct = new CubeThread(randomInt);
                ct.start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex);
            }
        }
    }
}

// ---------------- Square Thread ----------------
class SquareThread extends Thread {
    int num;

    SquareThread(int rn) {
        num = rn;
    }

    public void run() {
        System.out.println("Square of " + num + " is " + (num * num));
    }
}

// ---------------- Cube Thread ----------------
class CubeThread extends Thread {
    int num;

    CubeThread(int rn) {
        num = rn;
    }

    public void run() {
        System.out.println("Cube of " + num + " is " + (num * num * num));
    }
}

// ---------------- Main Class ----------------
public class PC1 {
    public static void main(String[] args) {
        RandomNumberThread rnt = new RandomNumberThread();
        rnt.start();
    }
}
