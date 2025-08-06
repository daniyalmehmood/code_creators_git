public class InRangeChecker {
    public static void main(String[] args) {
        System.out.println(inRangeOrOutside(5, false));// → true
        System.out.println(inRangeOrOutside(11, false));// → false
        System.out.println(inRangeOrOutside(11, true));// → true
    }
    public static boolean inRangeOrOutside(int n, boolean outsideMode) {
        if (outsideMode) {
            return (n <= 1 || n >= 10);
        }
        return (n >= 1 && n <= 10);
    }
}
