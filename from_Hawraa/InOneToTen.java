public class InOneToTen {
    public static boolean checkRangeWithMode(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkRangeWithMode(5, false));
        System.out.println(checkRangeWithMode(11, false));
        System.out.println(checkRangeWithMode(11, true));
    }
}
