//Recursion-1 > factorial
public class FactorialCalculator {
    public int computeFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * computeFactorial(n - 1);
    }

}
