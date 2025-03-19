package bt;

import java.util.Scanner;

public class BT12 {
    public static void main(String[] args) {
        // Bước 1: Khai báo username, password
        String username, password;
        // Bước 2: Nhập
        Scanner scanner = new Scanner(System.in);
        boolean isLogin = false;
        for (int i = 0; i < 3; i++) {
            // Nhập thông tin, kiểm tra xem thông tin đó có hợp lệ.
            System.out.print("Nhập username: ");
            username = scanner.nextLine();
            System.out.print("Nhập password: ");
            password = scanner.nextLine();
            // Kiểm tra: Logic kiểm tra tài khoản...
            if (username.equals("admin") && password.equals("admin")) {
                isLogin = true;
                break;
            }
        }
        if (isLogin) {
            System.out.println("Đăng nhập thành công!");
        } else {
            System.out.println("Đăng nhập thất bại!");
        }
        scanner.close();
    }
}
