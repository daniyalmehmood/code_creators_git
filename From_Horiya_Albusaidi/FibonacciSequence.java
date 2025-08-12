public class FibonacciSequence {
    public int getFibonacci(int n) {
        if (n == 0 || n == 1) return n;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

}
