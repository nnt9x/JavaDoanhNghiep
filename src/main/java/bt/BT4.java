package bt;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        // Bước 1: Khai báo
        double luongCoSo;
        int bac;
        // Bước 2: Nhập liệu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lương cơ sở: ");
        luongCoSo = scanner.nextDouble();
        System.out.print("Bậc: ");
        bac = scanner.nextInt();
        // Bước 3: Kiểm tra
        if (luongCoSo > 0 && bac >= 1 && bac <= 3) {
            // Tinh luong
            double luong = 0;
            if (bac == 1) {
                luong = luongCoSo;
            }
            if (bac == 2) {
                luong = luongCoSo + 2 * 1.5;
            }
            if (bac == 3) {
                luong = 1.2 * luongCoSo + 3 * 1.5;
            }
            System.out.println("Lương: " + luong);
        } else {
            // Khong hop le
            System.out.println("Không hợp lệ!");
        }
    }
}
