// Recursion-1 > factorial
public class FactorialCalculator {
    public int computeFactorialOfNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return n * computeFactorialOfNumber(n - 1);
    }
}