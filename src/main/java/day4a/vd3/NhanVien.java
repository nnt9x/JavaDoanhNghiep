package day4a.vd3;

public abstract class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    // Phuong thuc truu tuong
    public abstract void moTaCongViec();
}
