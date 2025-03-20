package day3a.vd3;

public class TaiKhoan {
    // STK, ten TK, so tien
    private String stk;
    private String tenTk;
    private int soTien;
    public String address;

    public TaiKhoan(String stk, String tenTk, int soTien) {
        this.stk = stk;
        this.tenTk = tenTk;
        this.soTien = soTien;
    }

    public void chuyenTien(int tien){
        this.soTien = this.soTien - tien;
    }
    public void nhanTien(int tien){
        this.soTien = this.soTien + tien;
    }

    public String getStk() {
        return stk;
    }

    public String getTenTk() {
        return tenTk;
    }

    public int getSoTien() {
        return soTien;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "stk='" + stk + '\'' +
                ", tenTk='" + tenTk + '\'' +
                ", soTien=" + soTien +
                '}';
    }


}
