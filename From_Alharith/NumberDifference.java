public class NumberDifference  {

    public int getAbsoluteDifferenceFrom21(int n) {
        if (n < 21) {
            return 21 - n;
        }
        return 2 * (n - 21);
    }
}
