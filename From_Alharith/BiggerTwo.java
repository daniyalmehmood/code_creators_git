public class BiggerTwo {

    public int[] getArrayWithLargerSum(int[] a, int[] b) {
        if ((a[0]+a[1])>=b[0]+b[1]) return a;
        return b;

    }

}
