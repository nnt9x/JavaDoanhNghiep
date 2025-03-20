package day3a.bt17;

import java.util.Scanner;

public class NhapXe {
    // Nhap du lieu tu ban phim -> tra ve 1 doi tuong Oto
    public static Oto nhapXe(Scanner scanner) {
        System.out.print("Nhập mã: ");
        String ma = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập dung tích");
        String dungTich = scanner.nextLine();
        System.out.print("Nhập tốc độ - cao:");
        double tocDoCao = scanner.nextDouble();
        System.out.print("Nhập tốc độ - thấp:");
        double tocDoThap = scanner.nextDouble();

        Oto oto = new Oto(ma, ten, dungTich, tocDoCao, tocDoThap);
        return oto;
    }
}
