package day2b.bt16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tao 10 nhan vien
        NhanVien nv1 = new NhanVien("NV1", "Nhân viên 1", 1990, "HN", 20);
        NhanVien nv2 = new NhanVien("NV2", "Nhân viên 2", 1991, "HN", 30);
        NhanVien nv3 = new NhanVien("NV3", "Nhân viên 3", 1992, "HN", 35);
        NhanVien nv4 = new NhanVien("NV4", "Nhân viên 4", 1993, "HN", 40);
        NhanVien nv5 = new NhanVien("NV5", "Nhân viên 5", 1994, "HN", 27);
        NhanVien nv6 = new NhanVien("NV6", "Nhân viên 6", 1995, "HN", 28);
        NhanVien nv7 = new NhanVien("NV7", "Nhân viên 7", 1996, "HN", 16);
        NhanVien nv8 = new NhanVien("NV8", "Nhân viên 8", 1997, "HN", 22);
        NhanVien nv9 = new NhanVien("NV9", "Nhân viên 9", 1998, "HN", 21);
        NhanVien nv10 = new NhanVien("NV10", "Nhân viên 10", 1999, "HN", 15);
        NhanVien nv11 = new NhanVien("NV11", "Nhân viên 11", 1999, "HN", 50);


        // Luu nhan vien vao 1 mang nhan vien
        List<NhanVien> listNhanVien = Arrays.asList(nv1, nv2, nv3, nv4, nv5, nv6, nv7, nv8, nv9, nv10, nv11);
        // In ra thong tin cua tung nhan vien
        for (int i = 0; i < listNhanVien.size(); i++) {
            System.out.println("Thong tin nhan vien vi tri " + i);
            System.out.println(listNhanVien.get(i));
        }
        // b. Tinh luong trung binh
        double tongLuong = 0;
        for (int i = 0; i < listNhanVien.size(); i++) {
            tongLuong = tongLuong + listNhanVien.get(i).luong;
        }
        double luongTb = tongLuong / listNhanVien.size();
        System.out.println("Luong trung binh: " + luongTb);

        // c. Co bao nhieu nguoi cao hon
        int count = 0;
        for (int i = 0; i < listNhanVien.size(); i++) {
            if(listNhanVien.get(i).luong > luongTb){
                count ++;
            }
        }
        System.out.println("So nguoi co luong cao hon trung binh: " + count);
    }
}
