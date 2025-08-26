public class SharedDigitChecker {
    public static boolean digitMatcher(int a, int b) {
        return a/10==b/10 || a%10==b%10 ||a/10==b%10 ||b/10==a%10 ;
    }
    public static void main(String[] args) {
        System.out.println(digitMatcher(12,23));
    }
}
