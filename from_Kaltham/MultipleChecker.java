//Logic-1 > old35

public class MultipleChecker {
    public boolean isMultipleOfThreeOrFiveOnly(int n) {
        if (n % 3 == 0 ^ n % 5 == 0) {
            return true;
        }
        return false;
    }
}