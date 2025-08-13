public class LoneSumHelper {
    public int sumUnique(int x, int y, int z) {
        int sum = 0;

        if (x != y && x != z) {
            sum += x;
        }

        if (y != x && y != z) {
            sum += y;
        }

        if (z != x && z != y) {
            sum += z;
        }

        return sum;
    }
}

