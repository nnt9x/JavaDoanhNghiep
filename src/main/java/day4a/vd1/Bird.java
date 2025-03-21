package day4a.vd1;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Bird can move, fly...");
    }
}
