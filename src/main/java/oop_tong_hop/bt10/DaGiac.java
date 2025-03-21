package oop_tong_hop.bt10;

public class DaGiac {
    private int soCanh;
    protected double kichThuoc[];

    // Phuong thuc khoi tao
    public DaGiac(int soCanh, double[] kichThuoc) {
        this.soCanh = soCanh;
        this.kichThuoc = kichThuoc;
    }

    // Phuong thuc tinh chu vi
    public double chuVi() {
        double t = 0;
        for (int i = 0; i < kichThuoc.length; i++) {
            t = t + kichThuoc[i];
        }
        return t;
    }

    // In ra cac cacnh cua da giac
    public void print() {
        System.out.println("Các cạnh đa giác: ");
        for (int i = 0; i < kichThuoc.length; i++) {
            System.out.print(kichThuoc[i] + "  ");
        }
        System.out.println();
    }
}
