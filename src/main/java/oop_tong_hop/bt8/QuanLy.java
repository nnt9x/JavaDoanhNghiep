package oop_tong_hop.bt8;

import oop_tong_hop.bt8.tailieu.TaiLieu;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    // Thuoc tinh
    private List<TaiLieu> taiLieuList;

    // Phuong thuc khoi tao
    public QuanLy() {
        this.taiLieuList = new ArrayList<>();
    }

    // Them tai lieu
    public void themTaiLieu(TaiLieu t) {
        taiLieuList.add(t);
    }

    // Them nhieu tai lieu
    public void themNhieuTaiLieu(TaiLieu... list) {
        for (TaiLieu t : list) {
            taiLieuList.add(t);
        }
    }


    // Hien thi cac loai tai lieu
    public void hienThiTaiLieu() {
        for (int i = 0; i < taiLieuList.size(); i++) {
            TaiLieu taiLieu = taiLieuList.get(i);
            System.out.println(taiLieu);
        }
    }

    // Tim kiem theo loai
    public void timKiemTheoLoai(String loai) {
        boolean isFound = false;
        for (int i = 0; i < taiLieuList.size(); i++) {
            TaiLieu taiLieu = taiLieuList.get(i);
            if (taiLieu.getClass().getSimpleName().equals(loai)) {
                System.out.println(taiLieu);
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("Không có kết quả!");
        }
    }
    // Cho phep tim kiem theo ma
    public void timKiemTheoMa(String ma){
        for (int i = 0; i < taiLieuList.size(); i++) {
            TaiLieu taiLieu = taiLieuList.get(i);
            if(taiLieu.getMaTaiLieu().contains(ma)){
                System.out.println(taiLieu);
            }
        }
    }


}
