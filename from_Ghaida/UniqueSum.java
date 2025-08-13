public class UniqueSum {
    public static void main(String[] args) {
        System.out.println(calculateUniqueSum(1, 2, 3));// → 6
        System.out.println(calculateUniqueSum(2, 13, 1));// → 2
        System.out.println(calculateUniqueSum(2, 1, 14));// → 0
    }
    public static int calculateUniqueSum(int a, int b, int c) {
        int sum = fixTeen(a) + fixTeen(b) + fixTeen(c);
        return sum;
    }
    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0; // Exclude teen values
        }
        return n; // Return the number if it's not a teen
    }
}
