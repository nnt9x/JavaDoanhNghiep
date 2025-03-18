package bt;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Không hợp lệ!");
        } else {
            // Tim ước
            System.out.print("Ước:");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
