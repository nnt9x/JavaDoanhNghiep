package day4a.vd2;

public class Main {
    public static void main(String[] args) {
        MyAuthen myAuthen = new MyAuthen();
        myAuthen.login(123, "bkacad");
        myAuthen.login("email","123");
    }
}
