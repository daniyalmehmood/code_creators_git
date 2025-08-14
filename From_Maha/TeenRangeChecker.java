public class TeenRangeChecker {
    public int sumIfBothNotTeens(int a, int b) {
        if ((a<13 || a>19) && (b<13 || b>19)) {
            return a + b;
        }
        return 19;
    }
}
