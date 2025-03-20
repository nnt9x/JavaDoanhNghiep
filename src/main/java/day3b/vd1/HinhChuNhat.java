package day3b.vd1;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai,
                       double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double dienTich() {
        return chieuDai * chieuRong;
    }
}
