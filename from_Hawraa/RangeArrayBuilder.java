// Array-2 > fizzArray3
public class RangeArrayBuilder {
    public int[] generateSequenceArray(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }
        return result;
    }
}
