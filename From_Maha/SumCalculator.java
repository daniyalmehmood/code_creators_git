public class SumCalculator {
    // Returns 20 if the sum of a and b is between 10 and 19 inclusive; otherwise returns the sum.
    public int calculateSpecialSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 19) {
            return 20;
        }
        return a + b;
    }
}
