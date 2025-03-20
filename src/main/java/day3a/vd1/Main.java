package day3a.vd1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 3 máy bay
        MayBay mb1 = new MayBay("MB1","J123","MB1",750);
        MayBay mb2 = new MayBay("MB2","J125","MB2",850);
        MayBay mb3 = new MayBay("MB3","J200","MB3",720);
        // In ra thoi gian bay tu Ha Noi den HCM cua moi may bay
        // 2000km
        System.out.println("Thời gian bay từ HN -> HCM của từng loại máy bay");
        double kc = 2000;
        System.out.printf("MB 1: %.2f giờ \n", mb1.thoiGianBay(kc));
        System.out.printf("MB 2: %.2f giờ \n",mb2.thoiGianBay(kc));
        System.out.printf("MB 3: %.2f giờ \n", mb3.thoiGianBay(kc));

        // Nhập thêm 1 máy bay từ bàn phím
        // Gợi ý: dùng Scanner
        // In thử thời gian từ HN -> Phú Quốc: 1800 Km
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã: ");
        String maMayBay = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String tenMayBay = scanner.nextLine();
        System.out.print("Nhập loại: ");
        String loaiMayBay = scanner.nextLine();

        System.out.print("Nhập tốc độ:");
        double tocDo = scanner.nextDouble();
        scanner.close();

        // Tao doi tuong
        MayBay mb4 = new MayBay(maMayBay,tenMayBay,loaiMayBay, tocDo);
        System.out.println("Thời gian bay HN -> Phú Quốc mb4: " + mb4.thoiGianBay(1800));
    }
}
// Ctr + /?
