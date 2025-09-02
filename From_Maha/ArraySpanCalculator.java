public class ArraySpanCalculator {
    public int calculateMaxSpan(int[] numbers) {
        int maxSpan = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentValue = numbers[i];
            for (int j = numbers.length - 1; j >= i; j--) {
                if (numbers[j] == currentValue) {
                    int span = j - i + 1;
                    if (span > maxSpan) {
                        maxSpan = span;
                    }
                    break;
                }
            }
        }
        return maxSpan;
    }
}
