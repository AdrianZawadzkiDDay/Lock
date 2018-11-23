package lock;

import java.util.Random;

public class Lock {
    private int correctA;
    private int correctB;
    private int correctC;

    private int currentA;
    private int currentB;
    private int currentC;

    public Lock(int correctA, int correctB, int correctC) {
        this.correctA = correctA;
        this.correctB = correctB;
        this.correctC = correctC;

        Random random = new Random();
        this.currentA = random.nextInt(10);
        this.currentB = random.nextInt(10);
        this.currentC = random.nextInt(10);

    }


    public boolean isOpen() {
        return currentA == correctA &&
                currentB == correctB &&
                currentC == correctC;
    }

    public void switchA() {
        if (currentA == 9) {
            currentA = 0;
        } else {
            currentA++;
        }
    }

    public void switchB() {
        if (currentB == 9) {
            currentB = 0;
        } else {
            currentB++;
        }
    }


    public void switchC() {
        if (currentC == 9) {
            currentC = 0;
        } else {
            currentC++;
        }
    }

    public String toString() {
        return "Aktualna kombinacja: " + currentA + currentB + currentC +
                ", poprawna kombinacja: " + correctA + correctB + correctC;
    }

}
