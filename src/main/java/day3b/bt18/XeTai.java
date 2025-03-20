package day3b.bt18;

public class XeTai extends Oto {
    public XeTai(double mucTieuThu) {
        super(mucTieuThu);
    }

    public XeTai(String tenPhuongTien, int dungTich, String mauSac, int gia, double mucTieuThu) {
        super(tenPhuongTien, dungTich, mauSac, gia, mucTieuThu);
    }

    public void choHang() {

    }

    @Override
    public String toString() {
        return "XeTai{" + super.toString() + "}";
    }
}
