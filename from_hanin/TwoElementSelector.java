public class TwoElementSelector {
    public int[] combineFirstTwo(int[] a, int[] b) {
        int[] result = new int[2];
        int count = 0;
        // Step 1: Add elements from array 'a'
        for (int i = 0; i < a.length && count < 2; i++) {
            result[count] = a[i];
            count++;
        }
        // Step 2: Add elements from array 'b'
        for (int i = 0; i < b.length && count < 2; i++) {
            result[count] = b[i];
            count++;
        }
        return result;
    }
}

