public class SumLimit {
    public static int fixedLengthSum(int a, int b) {
        if (String.valueOf(a + b).length() == String.valueOf(a).length()) {
            return a + b;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(fixedLengthSum(2, 3));
        System.out.println(fixedLengthSum(8, 3));
        System.out.println(fixedLengthSum(8, 1));
    }
}
