package bt;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        // Buoc 1: Khai bao
        int gio, phut;
        // Buoc 2: Nhap du lieu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gio My: ");
        gio = scanner.nextInt();
        System.out.print("Phut My:");
        phut = scanner.nextInt();
        // Buoc 3: Kiem tra
        if (gio >= 0 && gio <= 23 && phut >= 0 && phut <= 59) {
            // 14 h tiep theo la may gio ?
            int gioMoi = (gio + 14) % 24; // My
            int gioMoiVN;
            if (gioMoi >= 12) {
                gioMoiVN = gioMoi - 12;
            } else {
                // 3 AM  Mỹ => VN ?
                gioMoiVN = gioMoi + 12;
                System.out.printf("Gio Viet Nam %d:%d", gioMoiVN, phut);
            }
        } else {
            System.out.println("Gio, phut khong hop le");
        }
    }
}
