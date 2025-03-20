package day3a.bt17;

public class FormatTime {
    public static String formatTime(double hour) {
        // 2.5 => 2h30phut
        int h = (int) hour;
        int m = (int) ((hour - h) * 60);
        // 2:30:00
        String s = String.format("%d:%d:00", h, m);
        return s;
    }
}
