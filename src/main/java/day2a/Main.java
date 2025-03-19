package day2a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Vong lap while
        // VD: Nhập số nguyên dương từ bàn phím in ra bình phương của
        // số đó. Chương trình cho phép nhập nhiều lần cho đến khi
        // người dùng giá trị -1
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n = ");
        n = scanner.nextInt();
        while (n != -1) {
            System.out.printf("n^2 = %d \n", n * n);
            System.out.print("n = ");
            n = scanner.nextInt();
        }
        scanner.close();
    }
}
