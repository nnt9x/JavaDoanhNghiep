import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // Khai bao chuoi String, khai bao trong nhay kep
        String hoTen = "Nguyen Van A";
        System.out.println(hoTen);
        // Nhap dc String tu ban phim ?
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        // %d: số nguyên, %f: số thực , %s
        System.out.printf("Chuỗi vừa nhập: %s", s);
    }
}
