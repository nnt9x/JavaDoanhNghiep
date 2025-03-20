package day3b.bt18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Oto oto = new Oto("Honda City", 2000, "Đen", 1200000000, 5);
        XeMay xeMay = new XeMay("Honda", 110, "Đen-xám", 50000000, "thường");
        XeMay xeMay1 = new XeMay("Honda 1", 110, "Đen-xám", 50000000, "thường");
        XeMay xeMay2 = new XeMay("Honda 2", 110, "Đen-xám", 50000000, "thường");
        XeTai xeTai = new XeTai("Xe tai",5000,"Trang",1000000000,10);

        // Cần quản lý các loại phương tiện
        List<PhuongTien> phuongTienList = new ArrayList<>();
        phuongTienList.add(oto);
        phuongTienList.add(xeMay);
        phuongTienList.add(xeMay1);
        phuongTienList.add(xeMay2);
        phuongTienList.add(xeTai);

        for (int i = 0; i < phuongTienList.size(); i++) {
            PhuongTien phuongTien = phuongTienList.get(i);
            System.out.println(phuongTien);
            if(phuongTien.getClass().getSimpleName().equals("Oto")){
                System.out.println("Phí gửi 50k");
            }
            else if(phuongTien.getClass().getSimpleName().equals("XeMay")){
                System.out.println("Phí gửi 10k");
            }
            else if(phuongTien.getClass().getSimpleName().equals("XeTai")){
                System.out.println("Phí gửi 100k");
            }
        }
    }
}
