package day4a.vd4;

public class ATMPayment extends Payment{
    @Override
    public boolean payment(int amount) {
        // Connect Global ATM
        System.out.println("LOGIC check thẻ...");
        System.out.println("Logic check số tiền");
        System.out.println("Nếu đủ số tiền sẽ thanh toán thành công..");
        return false;
    }
}
