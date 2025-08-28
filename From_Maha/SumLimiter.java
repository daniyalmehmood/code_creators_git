public class SumLimiter {
    public int sumLimit(int a, int b) {
        String sum = String.valueOf(a + b);
        String aString = String.valueOf(a);
        if (sum.length() == aString.length()) {
            return a + b;
        }
        return a;
    }
}
