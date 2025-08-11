public class ArrayCounter {
    public int countArraysStartingWith1(int[] a, int[] b) {
        int count = 0;
        // Step 1: Check if array 'a' is not empty and starts with 1
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        // Step 2: Check if array 'b' is not empty and starts with 1
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        // Step 3: Return the total count
        return count;
    }
}
