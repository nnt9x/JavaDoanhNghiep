import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // VD: tính diện tích đường băng có chiều dài a, chiều rộng b
        // a, b là số thực
        // B1: khai báo
        double a, b;
        // B2: Nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        // B3: Tính chu vi, diện tích (* - phép nhân) ( / - phép chia)
        double cv = (a + b) * 2;
        double dt = a * b;
        // B4: In ra ..
        // a = 500.5, b = 10.5
        // %.2f là lấy sau dấu phẩy 2 chữ số
        System.out.printf("Chu vi đường băng = %.2f, diện tích  = %.2f",cv,dt);
    }
}
