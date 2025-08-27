//Logic-2 > luckySum


public class LuckySumCalculator {
    public int calculateLuckySum(int a, int b, int c) {
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
}