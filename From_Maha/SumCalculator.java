public class SumCalculator {
    // Returns the sum of three integers, but if any value is 13, ignore it and all values to its right
    public int sumIgnoringThirteen(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

