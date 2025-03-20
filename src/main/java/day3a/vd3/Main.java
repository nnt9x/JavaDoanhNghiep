package day3a.vd3;

public class Main {
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan("TK1","Tài khoản 1", 1000000);
        System.out.println("Kiem tra tai khoan:" + tk.getSoTien());
        tk.nhanTien(2000000);
        System.out.println("Kiem tra tai khoan:" + tk.getSoTien());
        tk.chuyenTien(500000);
        System.out.println("Kiem tra tai khoan:" + tk.getSoTien());
    }
}
