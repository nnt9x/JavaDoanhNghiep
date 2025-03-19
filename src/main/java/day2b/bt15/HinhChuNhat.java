package day2b.bt15;

public class HinhChuNhat {
    // Thuoc tinh
    public double chieuDai;
    public double chieuRong;

    // Phuong thuc khoi tao
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Phuong thuc tinh chu vi
    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    // Phuong thuc tinh dien tich
    public double dienTich() {
        return chieuDai * chieuRong;
    }
}
