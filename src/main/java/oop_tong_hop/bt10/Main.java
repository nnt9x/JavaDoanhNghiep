package oop_tong_hop.bt10;

public class Main {
    public static void main(String[] args) {
        DaGiac tuGiac = new DaGiac(4, new double[]{1.5, 2.5, 3.5, 4.5});
        System.out.println("Chu vi:" + tuGiac.chuVi());
        tuGiac.print();

        TamGiac tamGiac = new TamGiac( new double[]{3, 4, 5});
        System.out.println(tamGiac.chuVi());
        tamGiac.print();

        // Khong hop le
        TamGiac tamGiac1 = new TamGiac( new double[]{1, 4, 5});
        System.out.println(tamGiac1.chuVi());
        tamGiac1.print();
    }
}
