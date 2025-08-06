public class SortaSum {
    public int calculateSortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return a + b;
    }
}
