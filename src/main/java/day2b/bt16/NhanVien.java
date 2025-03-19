package day2b.bt16;

public class NhanVien {
    // Thuoc tinh
    public String maNhanVien;
    public String tenNhanVien;
    public int namSinh;
    public String diaChi;
    public int luong;

    // Phuong thuc khoi tao: constructor
    public NhanVien(String maNhanVien, String tenNhanVien, int namSinh, String diaChi, int luong) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.luong = luong;
    }
    // toString
    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", tenNhanVien='" + tenNhanVien + '\'' +
                ", namSinh=" + namSinh +
                ", diaChi='" + diaChi + '\'' +
                ", luong=" + luong +
                '}';
    }
}
