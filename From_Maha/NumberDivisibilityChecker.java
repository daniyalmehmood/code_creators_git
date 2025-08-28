public class NumberDivisibilityChecker {
    // Returns true if n is divisible by 3 or 5, but not both
    public boolean isDivisibleBy3Or5Only(int n) {
        return (n % 3 == 0) ^ (n % 5 == 0);
    }
}
