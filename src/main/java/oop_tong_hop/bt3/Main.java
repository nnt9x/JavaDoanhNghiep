package oop_tong_hop.bt3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhuongTien waveHonda = new PhuongTien("Wave", 110, 18000000);
        PhuongTien cup = new PhuongTien("Cup", 50, 15000000);
        PhuongTien kawasaki = new PhuongTien("Kawasaki", 250, 150000000);

        List<PhuongTien> phuongTienList = Arrays.asList(waveHonda, cup, kawasaki);

        for (int i = 0; i < phuongTienList.size(); i++) {
            // In ra tung xe va thue truoc ba tuong ung
            PhuongTien p = phuongTienList.get(i);

            System.out.println(p.toString());
            System.out.println("Thue truoc ba: " + p.thueTruocBa());
        }
    }
}
