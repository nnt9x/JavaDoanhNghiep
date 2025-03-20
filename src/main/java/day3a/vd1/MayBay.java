package day3a.vd1;

public class MayBay {
    // Thuộc tính
    private String maMayBay;
    private String tenMayBay;
    private String loaiMayBay;
    private double tocDoTrungBinh; // km/h

    // Phương thức khởi tạo - constructor
    public MayBay(String maMayBay, String tenMayBay, String loaiMayBay, double tocDoTrungBinh) {
        this.maMayBay = maMayBay;
        this.tenMayBay = tenMayBay;
        this.loaiMayBay = loaiMayBay;
        this.tocDoTrungBinh = tocDoTrungBinh;
    }

    // Tinh thoi gian bay
    public double thoiGianBay(double khoangCach) {
        double t = khoangCach / tocDoTrungBinh;
        return t;
    }

    // Setter-getter
    public String getMaMayBay() {
        return maMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public String getTenMayBay() {
        return tenMayBay;
    }

    public void setTenMayBay(String tenMayBay) {
        this.tenMayBay = tenMayBay;
    }

    public String getLoaiMayBay() {
        return loaiMayBay;
    }

    public void setLoaiMayBay(String loaiMayBay) {
        this.loaiMayBay = loaiMayBay;
    }

    public double getTocDoTrungBinh() {
        return tocDoTrungBinh;
    }

    public void setTocDoTrungBinh(double tocDoTrungBinh) {
        this.tocDoTrungBinh = tocDoTrungBinh;
    }
}
