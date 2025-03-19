package day2b;

public class Main {
    public static void main(String[] args) {
        // Class chỉ là định nghĩa, muốn sử dụng phải tạo đối
        Dog dog1 = new Dog("Bec giê", 2, "Đen");
        Dog dog2 = new Dog("Pitbull", 3, "Xám");
        Dog dog3 = new Dog("Cỏ", 2, " Vàng");

        dog1.eat();
        dog2.eat();
        dog3.run("nhanh");
        dog2.run("chậm");
    }
}
