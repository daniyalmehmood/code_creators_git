public class IsNumberWithinFlexibleRange {
    public static boolean isNumberWithinOneToTen(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        }

        return n >= 1 && n <= 10;
    }

    public static void main(String[] args) {
        System.out.println(isNumberWithinOneToTen(5, false));
        System.out.println(isNumberWithinOneToTen(11, false));
        System.out.println(isNumberWithinOneToTen(11, true));
    }

}
