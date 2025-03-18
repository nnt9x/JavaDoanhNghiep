package day1b;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // Viết 1 chương trình nhập vào thông tin thời tiết
        // Nếu bão, khẩn cấp: "Hoãn bay"
        // Còn lại là vẫn bay bình thương
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thời tiết: ");
        String thoiTiet = scanner.nextLine();
        // thoiTiet == "bao" hoac thoiTiet == "khan cap"
        if(thoiTiet.equals("bao") || thoiTiet.equals("khan cap")){
            System.out.println("Hoãn bay!");
            // Có thể thực hiện nhiều khối lệnh.
        }
        else{
            System.out.println("Bay bình thường!");
        }
    }
}
