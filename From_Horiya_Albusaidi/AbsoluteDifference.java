public class AbsoluteDifference {
    public static int diff21(int n) {
        int result;
        if (n > 21) {
            result = 2 * (n - 21);
        } else result = 21 - n;
        return result;
    }
}
