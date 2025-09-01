public class SpecialScoreCalculator {
    public int sumLargestSpecials(int[] a, int[] b) {
        int first = largest(a);
        int second = largest(b);
        return first + second;
    }

    public int largest(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}
