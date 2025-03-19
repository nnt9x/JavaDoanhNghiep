package day2b.bt15;

import day2b.HinhVuong;

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

        // Su dung class HinhVuong
        HinhVuong hv = new HinhVuong(10);
        System.out.println("Chu vi hinh vuong: " + hv.chuVi());
    }
}
