public class SumBiggerTwo {
    public int[] largerSumArray(int[] a, int[] b) {
        // Step 1: Calculate the sum of array 'a'
        int sumA = a[0] + a[1];
        // Step 2: Calculate the sum of array 'b'
        int sumB = b[0] + b[1];
        // Step 3: Compare sums and return the array with the larger sum
        if (sumB > sumA) {
            return b; // 'b' has a larger sum
        } else {
            return a; // 'a' has a larger sum or sums are equal
        }
    }
}


