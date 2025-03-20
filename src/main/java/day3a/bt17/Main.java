package day3a.bt17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Oto oto1 = new Oto("Oto1", "Ô tô 1", "2l", 200, 60);
        double t = oto1.tinhThoiGianDiChuyen(300);
        System.out.println("Thời gian di chuyển: " + FormatTime.formatTime(t));
        Scanner scanner = new Scanner(System.in);

        Oto oto2 = NhapXe.nhapXe(scanner);
        double t2 = oto2.tinhThoiGianDiChuyen(400);
        System.out.println("Thời gian di chuyển: " + FormatTime.formatTime(t2));

        scanner.close();
    }
}
