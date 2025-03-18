import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // Nhap 2 so nguyen a, b tu ban phim, in ra tong va hieu
        // B1: Khai bao a, b
        int a, b;
        // B2: Nhap a, b tu ban phim
        Scanner scanner = new Scanner(System.in);
        // print: trên 1 dòng, prinln: print line =>
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        // B3: tinh tong, hieu
        int tong = a + b;
        int hieu = a - b;
        // B4: In ra tong, hieu: print + format (in co dinh dang)
        System.out.printf("Tong = %d, hieu = %d", tong, hieu);
        // B5: Dong scanner
        scanner.close();
    }
}
