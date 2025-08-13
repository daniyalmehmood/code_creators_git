public class SpecialNumberChecker {
    public boolean isSpecialEleven(int n) {
        return n >= 0 && (n % 11 == 0 || n % 11 == 1);
    }
}
