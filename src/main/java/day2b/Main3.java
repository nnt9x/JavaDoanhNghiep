package day2b;

public class Main3 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng từ Class
        HinhVuong hv1 = new HinhVuong(4);
        HinhVuong hv2 = new HinhVuong(10);
        HinhVuong hv3 = new HinhVuong(8.5);
        // In ra chu vi, dien tich tung hinh
        System.out.println("Dien tich hinh vuong 1: " + hv1.dienTich());
        System.out.println("Dien tich hinh vuong 2: " + hv2.dienTich());
        System.out.println("Dien tich hinh vuong 3: " + hv3.dienTich());

        // Dien tich trung binh
        double tb = (hv1.dienTich()+ hv2.dienTich() + hv3.dienTich())/3;
        System.out.println("Dien tich: " + tb);

    }
}
