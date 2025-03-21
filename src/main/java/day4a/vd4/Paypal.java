package day4a.vd4;

public class Paypal extends Payment{
    @Override
    public boolean payment(int amount) {
        // Logic
        System.out.println("Connect check Trans....");
        System.out.println("Convert VND -> USD");
        System.out.println("Fee");

        return false;
    }
}
