//Logic-2 > evenlySpaced

public class EvenlySpaced {
    public boolean isEvenlySpaced(int a, int b, int c) {
        int smallValue = Math.min(a, b);
        smallValue = Math.min(smallValue, c);
        int largeValue = Math.max(a, b);
        largeValue = Math.max(largeValue, c);
        int mediumValue = (a + b + c) - smallValue - largeValue;

        if (Math.abs(mediumValue - smallValue) == Math.abs(mediumValue - largeValue)) {
            return true;
        }
        return false;
    }
}