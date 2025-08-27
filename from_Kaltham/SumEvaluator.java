//Logic - 1 > sortaSum

public class SumEvaluator {
    public int calculateSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }
}