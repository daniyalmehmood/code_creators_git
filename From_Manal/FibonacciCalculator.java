public class FibonacciCalculator {

    // Recursive function to calculate the nth Fibonacci number
    public static int getFibonacciNumber(int position) {
        // first two numbers in the sequence
        if (position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        }

        // sum of the two previous numbers
        return getFibonacciNumber(position - 1) + getFibonacciNumber(position - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci(0) = " + getFibonacciNumber(0));
        System.out.println("Fibonacci(1) = " + getFibonacciNumber(1));
        System.out.println("Fibonacci(2) = " + getFibonacciNumber(2));

}
}