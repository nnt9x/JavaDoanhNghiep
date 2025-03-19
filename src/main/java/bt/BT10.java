package bt;

public class BT10 {
    public static void main(String[] args) {
        // Trâu đứng: x, nằm: y, già: z
        for (int x = 1; x <= 19; x++) {
            for (int y = 1; y <= 31; y++) {
                for (int z = 3; z <= 98; z = z + 3) {
                    if (x + y + z == 100 && 5 * x + 3 * y + z / 3 == 100) {
                        System.out.printf("Trâu đứng %d, trâu nằm %d, trâu già %d \n",
                                x, y, z);
                    }
                }
            }
        }
    }
}
