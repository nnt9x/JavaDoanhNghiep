package day2b.bt15;

import java.util.Scanner;

public class BT15 {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat(10, 20);
        System.out.println("Chu vi: " + hcn1.chuVi());
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.print("Nhập cạnh a, b: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        scanner.close();
        // Tao doi tuong hinh chu nhat 2
        HinhChuNhat hcn2 = new HinhChuNhat(a, b);
        System.out.println("Chu vi: " + hcn2.chuVi());
    }
}
