package day1b;

public class Main2 {
    public static void main(String[] args) {
        // In ra các số từ 1 đến 100
        // for
        for (int i = 1; i <= 10; i = i + 1){
            System.out.print(i + " ");
        }
        System.out.println();
        // In ra câu xin chào 5 lần ? i++ <=> i = i + 1
        for(int i = 1; i <= 5; i++){
            System.out.println("Xin chào");
        }
        // In ra các số chẵn từ 1 đến 100 ? 2 4 6 8 ...100
        for (int i = 1; i <= 100; i = i + 1){
            // %: phép chia lấy dư 5 /3 = 1 dư 2
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        // C2
        System.out.println();
        for (int i = 2; i <= 100; i = i + 2){
            System.out.print(i + " ");
        }

    }
}
