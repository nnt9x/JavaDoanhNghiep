package day3a.bt17;

public class Oto {
    private String ma;
    private String ten;
    private String dungTich;
    private double tocDoCao;
    private double tocDoThap;
    private double tieuThu; // 6l/100km

    public Oto() {
    }

    public Oto(String ma, String ten, String dungTich, double tocDoCao, double tocDoThap) {
        this.ma = ma;
        this.ten = ten;
        this.dungTich = dungTich;
        this.tocDoCao = tocDoCao;
        this.tocDoThap = tocDoThap;
    }

    public Oto(String ma, String ten, String dungTich, double tocDoCao, double tocDoThap, double tieuThu) {
        this.ma = ma;
        this.ten = ten;
        this.dungTich = dungTich;
        this.tocDoCao = tocDoCao;
        this.tocDoThap = tocDoThap;
        this.tieuThu = tieuThu;
    }

    public double getTieuThu() {
        return tieuThu;
    }

    public void setTieuThu(double tieuThu) {
        this.tieuThu = tieuThu;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDungTich() {
        return dungTich;
    }

    public void setDungTich(String dungTich) {
        this.dungTich = dungTich;
    }

    public double getTocDoCao() {
        return tocDoCao;
    }

    public void setTocDoCao(double tocDoCao) {
        this.tocDoCao = tocDoCao;
    }

    public double getTocDoThap() {
        return tocDoThap;
    }

    public void setTocDoThap(double tocDoThap) {
        this.tocDoThap = tocDoThap;
    }

    // Tinh thoi gian di chuyen
    public double tinhThoiGianDiChuyen(double khoangCach) {
        double tocDoTB = (tocDoCao + tocDoThap) / 2;
        return khoangCach / tocDoTB; //Có thể lẻ 2.5,2.6
    }

    public double tinhMucTieuThu(double khoangCach) {
        return khoangCach * tieuThu / 100;
    }
}
