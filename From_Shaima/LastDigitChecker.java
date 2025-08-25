public class LastDigitChecker {
    public static boolean hasMatchingLastDigits(int a, int b, int c) {
        if (a%10==b%10 || a%10==c%10 ||b%10==c%10)return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasMatchingLastDigits(23,19,13));
    }
}
