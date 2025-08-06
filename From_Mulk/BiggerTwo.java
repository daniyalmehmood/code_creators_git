public class BiggerTwo {
    public int[] chooseBiggerTwoElementSum(int[] a, int[] b) {
        int suma = a[0] + a[1];
        int sumb = b[0] + b[1];
        if (suma >= sumb) {
            return a;
        } else {
            return b;
        }
    }
}