public class SeriesUpPattern {

    // Method to create the seriesUp pattern
    public static int[] seriesUp(int n) {
        // Calculate the total length of the array (sum of 1..n)
        int totalLength = n * (n + 1) / 2;
        int[] result = new int[totalLength];

        int index = 0;

        // For each group from 1 to n
        for (int group = 1; group <= n; group++) {
            // Add numbers from 1 to group into the array
            for (int num = 1; num <= group; num++) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println((seriesUp(3));
        System.out.println(seriesUp(4));
        System.out.println(seriesUp(2));
    }
}