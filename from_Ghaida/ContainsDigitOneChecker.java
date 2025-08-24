public class ContainsDigitOneChecker {//AP-1 > hasOne
    public static void main(String[] args) {
        System.out.println(hasDigitOne(10)); //  → true
        System.out.println(hasDigitOne(22)); // → false
        System.out.println(hasDigitOne(220)); // → false);
    }
    public static boolean hasDigitOne(int n) {
        if (n == 0) {
            return false;
        }
        if (n % 10 == 1) {
            return true;
        }
        return hasDigitOne(n / 10);
    }
}