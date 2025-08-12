public class OldThreeFive {
    public boolean checkMultipleOfThreeFive(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        }
        if ((n % 3 == 0) || (n % 5 == 0)) {
            return true;

        }
        return false;
    }
}
