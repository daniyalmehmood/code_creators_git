public class ToOrderChecker {
    public static boolean isInOrder(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            //return true if they are in strict increasing order
            return (a <= b) && (b <= c);
        } else {
            return (a < b) && (b < c);
        }
    }
}
    