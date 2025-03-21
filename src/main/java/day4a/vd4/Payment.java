package day4a.vd4;

public abstract class Payment {
    private String name;

    public Payment() {
    }

    public Payment(String name) {
        this.name = name;
    }

    public abstract boolean payment(int amount);
}
