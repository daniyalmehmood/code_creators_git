//Recursion-1 > powerN
public class ExponentCalculator {
    public int raiseToPower(int base, int n) {
        if (n == 0) {
            return 1;
        } else {
            return base * raiseToPower(base, n - 1);
        }
    }

}
