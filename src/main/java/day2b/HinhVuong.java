package day2b;

public class HinhVuong {
    // Thuoc tinh
    public double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    // Phuong thuc
    public double chuVi() {
        double cv = this.canh * 4;
        return cv;
    }

    public double dienTich() {
        double dt = this.canh * this.canh;
        return dt;
    }
}
