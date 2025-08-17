public class InOrderEqual {
    public boolean isStrictlyIncreasingOrEqual(int a, int b, int c, boolean equalOk) {
        if (a < b && b < c) {
            return true;
        }
        if (((a == b && b < c) || (b == c && a < b) || (a == b && b == c)) && equalOk) {
            return true;

        }
        return false;
    }

}