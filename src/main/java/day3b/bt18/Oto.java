package day3b.bt18;

public class Oto extends PhuongTien {
    private double mucTieuThu;

    public Oto(double mucTieuThu) {
        this.mucTieuThu = mucTieuThu;
    }

    public Oto(String tenPhuongTien, int dungTich, String mauSac, int gia, double mucTieuThu) {
        super(tenPhuongTien, dungTich, mauSac, gia);
        this.mucTieuThu = mucTieuThu;
    }

    @Override
    public String toString() {
        return "Oto{" +
                super.toString() +
                ", mucTieuThu=" + mucTieuThu +
                '}';
    }
}
