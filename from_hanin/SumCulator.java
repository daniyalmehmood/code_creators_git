public class SumCulator {
    public int findSum(int a, int b) {
        int sum = a + b;
//sums in the range 10..19 inclusive, so in that case just return 20.
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

}
