package week3;

public class MyCompanyThree {
    public void init() {
        Officer staff1 = new Officer("Joyah", 3000, 300,1965);
        Officer staff2 = new Officer("Mat", 2000, 100, 1974);
        Manager staff3 = new Manager("Minah", 8000,"Honda Accord", 1983);
        Clerk staff4 = new Clerk("Selamat", 800, 1978, 50);
        staff1.displayDetail();
        staff2.displayDetail();
        staff3.displayDetail();
        staff2.resigned();
        staff2.displayDetail();
        staff4.displayDetail();
    }
    public static void main(String[] args) {
        MyCompanyThree mct = new MyCompanyThree();
        mct.init();
    }
}

