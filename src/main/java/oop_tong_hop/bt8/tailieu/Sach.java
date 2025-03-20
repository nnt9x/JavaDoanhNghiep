package oop_tong_hop.bt8.tailieu;

public class Sach extends TaiLieu {
    private String tacGia;
    private int soTrang;

    public Sach(String tacGia, int soTrang) {
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public Sach(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String tacGia, int soTrang) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                super.toString() +
                ", tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
