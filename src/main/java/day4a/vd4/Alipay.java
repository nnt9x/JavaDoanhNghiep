package day4a.vd4;

public class Alipay extends Payment{
    @Override
    public boolean payment(int amount) {
        System.out.println("Thanh toan Alipay..");
        System.out.println("Connect ...");
        return false;
    }
}
