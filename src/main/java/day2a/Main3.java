package day2a;

public class Main3 {
    public static void main(String[] args) {
        // Từ khoá continue
        // In ra các số từ 1 đến 10 trừ số 3
        for (int i = 1; i <= 10; i++) {
            if (i == 3) continue;
            System.out.print(i + "\t");
        }
    }
}
