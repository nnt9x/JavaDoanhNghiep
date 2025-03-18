package bt;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        // Buoc 1: Khai bao
        int gio, phut;
        // Buoc 2: Nhap lieu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gio: ");
        gio = scanner.nextInt();
        System.out.print("Nhap phut: ");
        phut = scanner.nextInt();
        scanner.close(); // dong scanner
        // Buoc 3: Kiem tra du lieu
        if (gio >= 0 && gio <= 23 && phut >= 0 && phut <= 59) {
            // Hop le
            if (gio < 12) {
                // 8:00 = 8:00 AM
                System.out.printf("%d:%d=%d:%d AM", gio, phut, gio, phut);
            }
            if (gio == 12) {
                System.out.printf("%d:%d=%d:%d PM", gio, phut, gio, phut);
            }
            if (gio > 12) {
                int gio12 = gio - 12;
                System.out.printf("%d:%d=%d:%d PM", gio, phut, gio12, phut);
            }

        } else {
            System.out.println("Nhap sai dinh dang gio/phut");
        }
    }
}
