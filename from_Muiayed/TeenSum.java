public class TeenSum {

    public static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(teenSum(3, 4));   // 7
        System.out.println(teenSum(10, 13)); // 19
        System.out.println(teenSum(13, 2));  // 19
    }
}