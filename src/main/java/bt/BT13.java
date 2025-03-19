package bt;

import java.util.Scanner;

public class BT13 {
    public static void main(String[] args) {
        // Input: a, b int, (a < b)
        // Output: bội (có hoặc ko có)
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a, b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        if (a < b) {
            // Thực hiện tìm bội nhỏ nhất của 3 và 7
            boolean isFound = false;
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0 && i % 7 == 0) {
                    isFound = true;
                    System.out.println("Bội nhỏ nhất là: " + i);
                    break;
                }
            }
            if (!isFound) {
                System.out.println("Không tìm thấy bội chung");
            }
        } else {
            // Đưa ra thông báo
            System.out.println("a, b không hợp lệ");
        }
    }
}
