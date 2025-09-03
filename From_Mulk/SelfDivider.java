//AP-1 > dividesSelf
public class SelfDivider {
    public boolean isNumberDivisibleByItsDigits(int n) {
        int original = n;
        for (int i = 0; n > 0; i++) {
            if (n % 10 == 0 || (original % (n % 10) != 0)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

}