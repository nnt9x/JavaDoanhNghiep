package bt;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        // Khai bao
        String hoTen;
        int namSinh;
        // Nhap du lieu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập năm sinh: ");
        namSinh = scanner.nextInt();
        // In ra thong tin
        System.out.printf("Họ tên: %s, tuổi: %d", hoTen, 2025-namSinh);
        // Dong Scanner
        scanner.close();
    }
}
