package bt;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        // Input: 3 cạnh, dài, rộng, cao ( > 0)
        // Output: thể tích

        // B1: Khai báo và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập chiều cao: ");
        double c = scanner.nextDouble();
        scanner.close();
        // B2: Tính thẻ tích:
        double v = a * b * c;
        // B3: In ra thể tích
        System.out.printf("Thể tích = %.3f", v);
    }
}
