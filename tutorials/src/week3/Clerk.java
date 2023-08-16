package week3;

public class Clerk extends EmployeeThree{
    private double cola;
    private int yearborn;

    public Clerk(String n, double s, int y, double c){
        super(n,s);
        cola = c;
        yearborn = y;
    }

    public int getAge(){
        return (2014 - yearborn);

    }

    public void displayDetail(){
        super.displayDetail();
        System.out.println("AGE : " + getAge());
        System.out.println("COLA : " + cola);
    }

}
