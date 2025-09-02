//AP-1 > dividesSelf

public class SelfDivider {
    public boolean isDividesSelf(int n) {
        int num = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            n = n / 10;

        }
        return true;
    }
}