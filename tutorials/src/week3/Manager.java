package week3;

public class Manager extends EmployeeThree {
    private final String car;
    private final int  yearborn;

    public Manager(String n, double s, String c, int y) {
        super(n, s);
        car = c;
        yearborn = y;

    }

    public String getCar() {
        return car;
    }

    public int getAge() {
        return (2014 - yearborn);
    }

    @Override
    public void displayDetail() {

        super.displayDetail();
        System.out.println("AGE : " + getAge());
        System.out.println("CAR : " + car);
    }
}
