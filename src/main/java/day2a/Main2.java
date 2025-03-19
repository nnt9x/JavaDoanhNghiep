package day2a;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // VD: Tìm giá trị đầu tiên chia hết cho 3 trong đoạn [a, b]
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println("TH đầu tiên là: " + i);
                break; // Thoát khỏi vòng lặp ngay lập tức
            }
        }
    }
}
