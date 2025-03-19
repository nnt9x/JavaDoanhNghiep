package bt;

public class BT9 {
    public static void main(String[] args) {
        int x, y, z;
        int count = 0; // Bien dem
        for (x = 1; x <= 43; x++) {
            for (y = 1; y <= 22; y++) {
                for (z = 1; z <= 9; z++) {
                    if (x + 2 * y + 5 * z == 50) {
                        System.out.printf("x=%d y=%d z=%d \n",x,y,z);
                        count = count + 1;
                    }
                }
            }
        }
        System.out.printf("Co tat ca %d truong hop", count);
    }
}
