package week4.interfaces;

public class Bicycle extends Vehicle implements Interfaces.WheelSystem {
    public Bicycle(String t, int s) {
        super(t, s);

    }

    public void displayTotWheel() {
        System.out.println("Bicycle has 2 wheels");
    }
}
