public class NumberRangeChecker {
    public static boolean isInRangeOneToTen(int n, boolean outsideMode) {
        if (outsideMode) return n <= 1 || n >= 10;
        return n >= 1 && n <= 10;
    }
    public static void main(String[] args) {
        System.out.println(isInRangeOneToTen(5, false));
        System.out.println(isInRangeOneToTen(0, false));
        System.out.println(isInRangeOneToTen(0, true));
        System.out.println(isInRangeOneToTen(10, true));  
    }
}