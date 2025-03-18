package bt;

public class BT8 {
    public static void main(String[] args) {
        for (int x = 1; x < 36; x++) {
            for (int y = 1; y < 25; y++) {
                if (2 * x + 4 * y == 100 && x + y == 36) {
                    System.out.printf("Số gà %d, số chó %d", x, y);
                }
            }
        }
    }
}
