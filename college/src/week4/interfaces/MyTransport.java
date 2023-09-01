package week4.interfaces;

public class MyTransport {
    public static void main(String[] args) {
        JetSki js = new JetSki("water", 40);
        Bicycle b = new Bicycle("land", 20);
        Motobike mb = new Motobike("land", 200);
        Aircraft a = new Aircraft("air", 1000);
        Glider g = new Glider("air",500);

        js.startEngine();

        b.displayTotWheel();

        mb.startEngine();
        mb.displayTotWheel();
        mb.register(1001);

        a.startEngine();
        a.displayTotWheel();
        a.displayMaxAltitude();
        a.register(2001);

        g.displayTotWheel();
        g.displayMaxAltitude();

    }
}

