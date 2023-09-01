package week4.interfaces;

import java.sql.SQLOutput;

public class JetSki extends Vehicle implements Interfaces.Engine{

    public JetSki(String t, int s) {
        super(t, s);
    }
    public void startEngine() {
        System.out.println("JetSki engine starts - vroosh...vroosh...");
    }
}



