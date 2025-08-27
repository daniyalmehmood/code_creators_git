//Logic-1 > nearTen

public class CloseToTenChecker {
    public boolean isNearMultipleOfTen(int num) {
        if (num % 10 <= 2 || num % 10 == 8 || num % 10 == 9) {
            return true;
        }
        return false;
    }
}