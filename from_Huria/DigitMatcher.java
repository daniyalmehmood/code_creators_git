public class DigitMatcher {
    public static boolean digitMatcher(int a, int b) {
        if ((a / 10 == b % 10) || (a % 10 == b / 10) || (a / 10 == b / 10) || (a % 10 == b % 10)) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(digitMatcher(12, 23));
        System.out.println(digitMatcher(12, 43));
        System.out.println(digitMatcher(12, 44));
    }
}
