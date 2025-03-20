package day3a.bt17;

public class Main {
    public static void main(String[] args) {
        Oto oto1 = new Oto("Oto1", "Ô tô 1", "2l", 200, 60);
        double t = oto1.tinhThoiGianDiChuyen(300);
        System.out.println("Thời gian di chuyển: " + FormatTime.formatTime(t));
    }
}
