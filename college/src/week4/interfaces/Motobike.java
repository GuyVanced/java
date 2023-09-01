package week4.interfaces;

public class Motobike extends Vehicle implements Interfaces.WheelSystem, Interfaces.Engine, Interfaces.Registration{
    public Motobike(String t, int s) {
        super(t,s);
    }

    public void startEngine(){
        System.out.println("Motobike engine starts - vroom....vroom....");
    }
    public void displayTotWheel(){
        System.out.println("Motobike has 2 wheels");
    }
    public void register(int regNo){
        System.out.println("Motorbike registered. Register Id : " + regNo);
    }
}

