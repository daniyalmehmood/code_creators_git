public class SumWithDigitLimit {
    public static int sumWithDigitLimit(int a, int b) {
        int sum = a + b;
        String aStr = String.valueOf(a);
        String sumStr = String.valueOf(sum);

        if (sumStr.length() == aStr.length()) {
            return sum;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {

        System.out.println(sumWithDigitLimit(2, 3));
        System.out.println(sumWithDigitLimit(8, 3));
        System.out.println(sumWithDigitLimit(8, 1));
    }
}
