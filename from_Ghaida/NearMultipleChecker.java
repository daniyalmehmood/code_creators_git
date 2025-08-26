public class NearMultipleChecker {
    public static void main(String[] args) {
        System.out.println(isJustBeforeMultiple(18));// → true
        System.out.println(isJustBeforeMultiple(19));// → true
        System.out.println(isJustBeforeMultiple(20));// → false
    }
    public static boolean isJustBeforeMultiple(int n) {
        int m = n % 20;
        return (m == 18 || m == 19);
    }
}
