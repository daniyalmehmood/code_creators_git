//Recursion-1 > factorial

public class FactorialCalculator {
    public int calculateFactorial(int n) {

        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}