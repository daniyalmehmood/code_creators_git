public class TeenSumChecker {
    public static void main(String[] args) {
        System.out.println(calculateTeenSum(3, 4));// → 7
        System.out.println(calculateTeenSum(10, 13));// → 19
        System.out.println(calculateTeenSum(13, 2));// → 19
    }
    public static int calculateTeenSum(int a, int b) {
        int sum = a + b;
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        }
        return sum;
    }
}
