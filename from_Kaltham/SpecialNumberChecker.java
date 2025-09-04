//Logic-1 > specialEleven

public class SpecialNumberChecker {
    public boolean isSpecial(int n) {
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        }
        return false;
    }
}