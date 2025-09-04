public class FibonacciCalculator {//Recursion-1 > fibonacci
    public static void main(String[] args) {
        System.out.println(calculateFibonacci(0));// → 0
        System.out.println(calculateFibonacci(1));// → 1
        System.out.println(calculateFibonacci(2));// → 1
    }
    public static int calculateFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}