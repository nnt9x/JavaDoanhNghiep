package day3b.vd1;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(3, 4);
        System.out.println("Dien tich: " + hcn.dienTich());
        HinhVuong hv = new HinhVuong(4);
        System.out.println("Dien tich: "+ hv.dienTich());
        System.out.println("Chu vi: "+ hv.chuVi());

    }
}
