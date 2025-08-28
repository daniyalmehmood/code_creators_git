public class LoneTeen {
    public boolean isExactlyOneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b < 13 || b > 19)) {
            return true;
        }
        else if ((b >= 13 && b <= 19) && (a < 13 || a > 19)) {
            return true;
        }
        return false;
    }
}
