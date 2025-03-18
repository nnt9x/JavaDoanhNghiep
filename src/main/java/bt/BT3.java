package bt;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        // B1: Khai bao chieu dai, chieu rong
        double chieuDai, chieuRong;
        // B2: Nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai, chieu rong: ");
        chieuDai = scanner.nextDouble();
        chieuRong = scanner.nextDouble();
        // B3: Kiem tra
        if (chieuDai > 0 && chieuRong > 0){
            // Tinh toan
            double dt = chieuDai * chieuRong;
            double tien = dt * 50000000;
            System.out.printf("Giá khu đất kích thước %.2f x %.2f là %.2f",
                    chieuDai, chieuRong, tien);
        }
        else{
            // In ra khong hop le
            System.out.println("Không hợp lệ!");
        }
    }
}
