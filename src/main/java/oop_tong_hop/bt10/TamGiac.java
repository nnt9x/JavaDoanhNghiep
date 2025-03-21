package oop_tong_hop.bt10;

public class TamGiac extends DaGiac {

    public TamGiac(double[] kichThuoc) {
        super(3, kichThuoc);
    }

    // Ghi de tinh chu vi
    @Override
    public double chuVi() {
        // Logic: kiem tra xem co phai 3 canh cua tam giac ?
        double a = kichThuoc[0];
        double b = kichThuoc[1];
        double c = kichThuoc[2];
        if (a + b > c && b + c > a && a + c > b) {
            return super.chuVi();
        } else {
            return -1;
        }
    }
}
