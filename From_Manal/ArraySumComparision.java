import java.util.Arrays;

public class ArraySumComparision {
    public static int[] getBiggerOfTwoNumber(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if(sumB > sumA){
            return b;
        }
        return a;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getBiggerOFTwoNumber(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(getBiggerOfTwoNumber(new int[]{3, 4}, new int[]{1, 2})));
        System.out.println(Arrays.toString(getBiggerOFTwoNumber(new int[]{1, 1}, new int[]{1, 2})));
    }
}
