package oop_tong_hop.bt3;

public class PhuongTien {
    private String tenXe;
    private int dungTich;
    private int giaXe;

    public PhuongTien() {
    }

    public PhuongTien(String tenXe, int dungTich, int giaXe) {
        this.tenXe = tenXe;
        this.dungTich = dungTich;
        this.giaXe = giaXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public int getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(int giaXe) {
        this.giaXe = giaXe;
    }

    public float thueTruocBa() {
        float thue = 0;
        if (dungTich < 100) {
            thue = giaXe * 0.01f;
        } else if (dungTich >= 100 && dungTich <= 200) {
            thue = giaXe * 0.03f;
        } else if (dungTich > 200) {
            thue = giaXe * 0.05f;
        }
        return thue;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "tenXe='" + tenXe + '\'' +
                ", dungTich=" + dungTich +
                ", giaXe=" + giaXe +
                '}';
    }
}
