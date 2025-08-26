public class ShareDigitChecker {
    public static void main(String[] args) {
        System.out.println(checkShareDigits(12, 23));// → true
        System.out.println(checkShareDigits(12, 43));// → false
        System.out.println(checkShareDigits(12, 44));// → false
    }
    public static boolean checkShareDigits(int a, int b) {
        int leftDigitOfA = a/10;
        int leftDigitOfB = b/10;
        int rightDigitOfA = a%10;
        int rightDigitOfB = b%10;
        if (leftDigitOfA == leftDigitOfB || leftDigitOfA == rightDigitOfB || leftDigitOfB == rightDigitOfA || rightDigitOfA==rightDigitOfB) {
            return true;
        }
        return false;
    }
}
