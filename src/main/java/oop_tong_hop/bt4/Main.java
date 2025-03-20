package oop_tong_hop.bt4;

public class Main {
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan(12345,"Tai Khoan 1",1000000);
        TaiKhoan tk2 = new TaiKhoan(6789,"Tai khoan 2", 3000000);
        // tk1: thanh toan 2000000
        tk1.chuyenTien(200000);
        System.out.println(tk1); // 800.000
        // tk1 -> chuyen sang tk2: 300000
        tk1.chuyenKhoan(tk2, 3000000);
        // Kiem tra so du cuoi cua hai tk
        System.out.println(tk1);
        System.out.println(tk2);
    }
}
