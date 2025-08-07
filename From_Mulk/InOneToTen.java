public class InOneToTen {
    public boolean checkOneToTen(int n, boolean outsideMode) {
        if ((n <= 1 || n >= 10) && outsideMode) {
            return true;
        }
        if (n >= 1 && n <= 10 && !outsideMode) {
            return true;

        }
        return false;
    }
}
