// AP-1 > dividesSelf
public class DividingChecker {
    public boolean isSelfDividing(int n) {
        int originalN = n;
        while (0 < n) {
            int digit = n % 10;
            if (digit == 0 || originalN % digit != 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}
