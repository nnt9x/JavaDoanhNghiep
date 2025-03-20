package day3b.bt18;

public class PhuongTien {
    private String tenPhuongTien;
    private int dungTich;
    private String mauSac;
    private int gia;

    public PhuongTien() {
    }

    public PhuongTien(String tenPhuongTien, int dungTich, String mauSac, int gia) {
        this.tenPhuongTien = tenPhuongTien;
        this.dungTich = dungTich;
        this.mauSac = mauSac;
        this.gia = gia;
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "tenPhuongTien='" + tenPhuongTien + '\'' +
                ", dungTich=" + dungTich +
                ", mauSac='" + mauSac + '\'' +
                ", gia=" + gia +
                '}';
    }
}
