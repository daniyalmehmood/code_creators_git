public class LoveSix {
    public boolean sixCheck(int a, int b) {
        if ((a + b) == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        if (a == 6 || b == 6) {
            return true;

        }
        return false;
    }
}

