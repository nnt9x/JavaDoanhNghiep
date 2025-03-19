package oop_tong_hop.bt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nhap 3 sinh vien tu ban phim va luu vao 1 list
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> sinhVienList = new ArrayList<>(); // Tao 1 list rong
        for (int i = 1; i <= 3; i++) {
            System.out.println("Nhập thông tin sinh viên thứ:" + i);

            System.out.print("Nhập tên:");
            String hoTen = scanner.nextLine();
            System.out.print("Nhập mã: ");
            int maSV = scanner.nextInt();
            System.out.print("Nhập điểm LT: ");
            float lt = scanner.nextFloat();
            System.out.print("Nhập điểm TH: ");
            float th = scanner.nextFloat();

            // fix: vua doc so, chuoi
            scanner.nextLine();

            // Tao doi tuong sinh vien
            SinhVien sv = new SinhVien(maSV, hoTen, lt, th);
            // Them sinh vien vao list
            sinhVienList.add(sv);
        }
        scanner.close();

        // Cap nhat lai diem sinh vien 1 bi sai: TH = 10
        sinhVienList.get(0).setDiemTH(10);

        // In ra thong tin cua tung ban va in diem trung binh
        for (int i = 0; i < sinhVienList.size() ; i++) {
            System.out.println(sinhVienList.get(i).toString());
            System.out.println("Điểm TB: " + sinhVienList.get(i).diemTB());
            System.out.println("---------------------");
        }
    }
}
