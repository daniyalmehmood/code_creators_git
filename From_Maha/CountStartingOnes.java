public class CountStartingOnes {
   // Counts how many of the two arrays start with the number 1.
    public int countArraysStartingWithOne(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }
}
