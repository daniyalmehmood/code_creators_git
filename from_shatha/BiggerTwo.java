import java.util.Arrays;
public class BiggerTwo {
    public static int[] getArrayWithLargerSum(int[] a, int[] b) {
     if ((a[0]+a[1]) >= (b[0]+b[1])){
         return  new int[] {a[0],a[1]};
        }
     else {
         return new int[]{b[0], b[1]};
     }
}
    public static void main(String[] args){
        System.out.println(Arrays.toString(getArrayWithLargerSum(new int[] {1,2},new int[] {3,4})));
        System.out.println(Arrays.toString(getArrayWithLargerSum(new int[] {3,4},new int[] {1,2})));
        System.out.println(Arrays.toString(getArrayWithLargerSum(new int[] {1,1},new int[] {1,2})));

    }
}
