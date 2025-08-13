
public class LuckySumHelper {
    public static int calculateLuckySum(int x, int y, int z) {
        //if one of the values is 13 then it does not count
        if (x == 13) {
            return 0;
        } else if (y == 13) {
            return x;
        } else if (z == 13) {
            return x + y;
        } else {
            return x + y + z;
        }
    }
}
