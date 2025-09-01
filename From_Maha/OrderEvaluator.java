public class OrderEvaluator {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            if (a <= b && b <= c) {
                return true;
            }
        }
        return (a < b && b < c);
    }
}
