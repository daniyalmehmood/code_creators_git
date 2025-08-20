
//Logic-1 > less20

public class NearMultipleChecker {
    public boolean isJustBeforeMultipleOfTwenty(int n) {
        if (n % 20 == 18 || n % 20 == 19) {
            return true;
        }
        return false;
    }
}