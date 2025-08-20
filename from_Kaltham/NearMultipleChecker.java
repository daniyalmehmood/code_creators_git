//Logic-1 > more20

public class NearMultipleChecker {
    public boolean isNearMultipleOfTwenty(int n) {
        if (n % 20 == 1 || n % 20 == 2) {
            return true;
        }
        return false;
    }
}