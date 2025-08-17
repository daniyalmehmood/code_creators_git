public class InOneToTen {

    public boolean isInRangeWithMode(int n, boolean outsideMode) {
        if (outsideMode) {
            return (n <= 1 || n >= 10);
        } else {
            return (n >= 1 && n <= 10);
        }
    }

}
