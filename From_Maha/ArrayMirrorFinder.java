public class ArrayMirrorFinder {
    public int findMaxMirrorLength(int[] numbers) {
        int maximum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j >= 0; j--) {
                int count = 0;
                int start = i;      // moves forward from the i-th position
                int reverse = j;    // moves backward from the j-th position

                while (start < numbers.length && reverse >= 0 && numbers[start] == numbers[reverse]) {
                    count++;
                    start++;
                    reverse--;
                }

                maximum = Math.max(maximum, count);
            }
        }

        return maximum;
    }
}
