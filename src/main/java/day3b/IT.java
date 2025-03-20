package day3b;

public class IT extends NhanVien{
    private String congViec;

    public IT(String congViec) {
        this.congViec = congViec;
    }

    public IT(String maNhanVien, String hoTen, String ngaySinh, String diaChi, String gioiTinh, String congViec) {
        super(maNhanVien, hoTen, ngaySinh, diaChi, gioiTinh);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
}
