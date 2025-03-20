package oop_tong_hop.bt4;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class TaiKhoan {
    private int soTaiKhoan;
    private String tenTaiKhoan;
    private double soTien;
    private final double laiSuat = 0.035;

    public TaiKhoan() {
    }

    public TaiKhoan(int soTaiKhoan, String tenTaiKhoan, double soTien) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTien = soTien;
    }

    public TaiKhoan(int soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTien = 50;
    }

    public int getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    @Override
    public String toString() {
        Locale vn = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(vn);
        return "TaiKhoan{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTien=" + format.format(soTien) +
                '}';
    }

    // Nap tien
    public void napTien(double soTien) {
        if (soTien < 0) {
            System.out.println("Số tiền không hợp lệ");
        } else {
            this.soTien = this.soTien + soTien;
        }
    }

    public void chuyenTien(double tien) {
        if (tien < 0) {
            System.out.println("Số tiền không hợp lệ");
        } else if (tien > this.soTien) {
            System.out.println("Vượt quá số dư!");
        } else {
            // Hop le
            this.soTien = this.soTien - tien;
        }
    }

    public void chuyenKhoan(TaiKhoan taiKhoanKhac, int tien) {
        // Chuyen tu tai khoan nay, sang tai khoan khac
        if (tien < 0) {
            System.out.println("Số tiền không hợp lệ");
        } else if (this.soTien < tien) {
            System.out.println("Vượt quá số dư!");
        }
        else{
            // A -> B 500.000 -> A - 500.000; B + 500.000
            this.soTien = this.soTien - tien;
            taiKhoanKhac.soTien = taiKhoanKhac.soTien + tien;
        }
    }
}
