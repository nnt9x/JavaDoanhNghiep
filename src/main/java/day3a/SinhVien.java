package day3a;

public class SinhVien {
    // Thuộc tính gì: chiều cao, cân nặng, màu da, tên, tuổi...
    // Phương thức: hành động - hành vi: học(), thểthao()..
    String maSinhVien;
    String hoTen;
    String ngaySinh;
    String gioiTinh;
    String diaChi;

    // Phuong thuc khoi tao - constructor
    public SinhVien(String maSinhVien, String hoTen) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
    }

    public void hoc(String moTa) {
        // \n: new line -> xuống dòng
        System.out.printf("Bạn sinh viên %s-%s, học rất %s \n", maSinhVien, hoTen, moTa);
    }

}
