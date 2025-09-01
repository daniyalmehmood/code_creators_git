public class RoundSumHelper {
    public static int sumRoundedToNearestTen(int x, int y, int z) {
        int sum = 0;
        // Round 'x' to nearest 10
        if (x % 10 >= 5) {
            x = x + (10 - x % 10); // round up
        } else {
            x = x - (x % 10); // round down
        }
        // Round 'y' to nearest 10
        if (y % 10 >= 5) {
            y = y + (10 - y % 10); // round up
        } else {
            y = y - (y % 10); // round down
        }

        // Round 'z' to nearest 10
        if (z % 10 >= 5) {
            z = z + (10 - z % 10); // round up
        } else {
            z = z - (z % 10); // round down
        }

        // Add all rounded values
        sum = x + y + z;

        return sum;
    }
}

