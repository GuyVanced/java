package week4.interfaces;

public class Glider extends Vehicle implements Interfaces.FlightSystem, Interfaces.WheelSystem{

    public Glider(String t, int s){
        super(t,s);
    }
    public void displayTotWheel(){
        System.out.println("Glider has 3 wheels");
    }

    public void displayMaxAltitude(){
        System.out.println("Glider altitutde is 3000m");
    }



}
