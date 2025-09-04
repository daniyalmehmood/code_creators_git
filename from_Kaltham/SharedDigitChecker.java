//Logic-1 > shareDigit

public class SharedDigitChecker {
    public boolean hasSharedDigit(int a, int b) {
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            if (a % 10 == b / 10 || a / 10 == b % 10 || a % 10 == b % 10 || a / 10 == b / 10) {
                return true;
            }
        }
        return false;
    }
}