public class OrderChecker {
    public static boolean isInOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            // return true if b is greater than a, and c is greater than b
            return c > b;
        } else {
            return (b > a) && (c > b);
        }
    }
}
