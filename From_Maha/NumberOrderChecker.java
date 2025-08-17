public class NumberOrderChecker {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            if (c > b) {
                return true;
            }
        }
        return (b > a && c > b);
    }
}
