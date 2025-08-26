public class SumLimitChecker {
    public static int sumWithDigitLimit(int a, int b) {
        int sum = a + b;
        if (String.valueOf(sum).length() == String.valueOf(a).length()) { //if the number of digits in sum is the same as the number of digits in a
            return sum;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(sumWithDigitLimit(2,8));
    }
}
