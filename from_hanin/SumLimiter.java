public class SumLimiter {
    public int limitedSum(int a, int b) {
        int sum = a + b;
        String aStr = String.valueOf(a);
        String sumStr = String.valueOf(sum);
        // If the length of the string. a and b equals , just return sum
        if (sumStr.length() == aStr.length()) {
            return sum;
        } else {
            return a;
        }
    }
}

