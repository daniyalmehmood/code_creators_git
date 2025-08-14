public class TeenSum {
    public static int sumWithTeenCheck(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sumWithTeenCheck(3, 4));
        System.out.println(sumWithTeenCheck(10, 13));
        System.out.println(sumWithTeenCheck(13, 2));
    }
}
