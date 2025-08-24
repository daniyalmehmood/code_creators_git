public class DividesSelfChecker {//AP-1 > dividesSelf
    public static void main(String[] args) {
        System.out.println(isDividesSelf(128)); //  → true
        System.out.println(isDividesSelf(12)); // → false
        System.out.println(isDividesSelf(120)); // → false);
    }
    public static boolean isDividesSelf(int n) {
        if (n == 0) {
            return false;
        }
        int originalNumber = n;
        while (n > 0) {
            int rightMostDigit = n % 10;
            if (rightMostDigit == 0 || originalNumber % rightMostDigit != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}