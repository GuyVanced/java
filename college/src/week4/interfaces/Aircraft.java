package week4.interfaces;

public class Aircraft extends Vehicle implements Interfaces.Engine, Interfaces.WheelSystem, Interfaces.FlightSystem {
    public Aircraft(String t, int s) {
        super(t, s);
    }

    public void startEngine() {
        System.out.println("Aircraft engine starts - viuuuuu.");
    }

    public void displayTotWheel() {

        System.out.println("Aircraft has 3 wheels");
    }

    public void displayMaxAltitude() {

        System.out.println("Aircraft altitude is 15000m");
    }
    public void register(int regNo){
        System.out.println("Aircraft registered. Register Id : " + regNo);
    }
}
