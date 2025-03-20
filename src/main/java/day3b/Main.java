package day3b;

public class Main {
    public static void main(String[] args) {
        IT it1 = new IT("IT1","IT1","2000-01-01","HN","Nam","IT Support");
        // In ra thong tin ho ten va dia chi
        System.out.println(it1.getHoTen());
        System.out.println(it1.getDiaChi());
        it1.kiemTraMucLuong();
    }
}
