package day3b.bt18;

public class XeMay extends PhuongTien {
    private String loaiXe;

    public XeMay(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public XeMay(String tenPhuongTien, int dungTich, String mauSac, int gia, String loaiXe) {
        super(tenPhuongTien, dungTich, mauSac, gia);
        this.loaiXe = loaiXe;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                super.toString() +
                ",loaiXe='" + loaiXe + '\'' +
                '}';
    }
}
