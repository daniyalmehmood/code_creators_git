public class TeenSumCalculator {
    public static int calculateTeenSum(int a, int b) {
        boolean isTeenA = a >= 13 && a <= 19;
        boolean isTeenB = b >= 13 && b <= 19;
        if (isTeenA || isTeenB) return 19;
        {
            return a + b;
        }
    }
    public static void main(String[] args) {
        System.out.println(calculateTeenSum(3,4));
        System.out.println(calculateTeenSum(10, 13));
        System.out.println(calculateTeenSum(13, 2));
    }
}