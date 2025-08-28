public class SeriesUp {
    public static int[] seriesUp(int n) {
        int[] res = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                res[index++] = j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] result = seriesUp(4);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}