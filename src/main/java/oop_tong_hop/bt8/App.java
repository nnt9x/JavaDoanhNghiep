package oop_tong_hop.bt8;

import oop_tong_hop.bt8.tailieu.Bao;
import oop_tong_hop.bt8.tailieu.Sach;
import oop_tong_hop.bt8.tailieu.TapChi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Du lieu
        Sach sach1 = new Sach("S1", "BK", 1000, "BKACAD", 100);
        Sach sach2 = new Sach("S2", "BK", 5000, "BKACAD", 110);
        Sach sach3 = new Sach("S3", "BK", 4000, "BKACAD", 120);
        TapChi tapChi1 = new TapChi("TC1", "TuoiTre", 5000, 10, 3);
        Bao bao1 = new Bao("B1", "Bao Moi", 1000, "20/3/2025");

        // Dua vao quan ly
        QuanLy quanLy = new QuanLy();
        quanLy.themNhieuTaiLieu(sach1, sach2, sach3, tapChi1, bao1);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMENU");
            System.out.println("0. Nhập thêm tài liệu");
            System.out.println("1. Hiển thị toàn bộ tài liệu");
            System.out.println("2. Tìm kiếm theo loại");
            System.out.println("3. Tìm kiếm theo mã");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int select = scanner.nextInt();
            scanner.nextLine();
            if (select < 1 || select > 4) {
                System.out.println("Chọn lại!");
                continue;
            }
            if (select == 1) {
                quanLy.hienThiTaiLieu();
            } else if (select == 2) {
                System.out.print("Nhập loại: ");
                String loai = scanner.nextLine();
                quanLy.timKiemTheoLoai(loai);
            } else if (select == 3) {
                System.out.print("Nhập mã: ");
                String ma = scanner.nextLine();
                quanLy.timKiemTheoMa(ma);
            } else {
                System.out.println("Kết thúc!");
                System.exit(1);
            }
        }
    }
}
