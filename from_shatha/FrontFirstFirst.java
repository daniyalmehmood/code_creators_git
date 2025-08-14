import java.util.Arrays;

public class FrontFirstFirst {
    public static int[] GetFirstElements(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};

        } else if (a.length > 0) {
            return new int[]{a[0]};
        } else if (b.length > 0) {
            return new int[]{b[0]};
        } else {
            return new int[0];
        }
    }
        public static void main(String[] args){
            System.out.println(Arrays.toString(GetFirstElements(new int[] {1,2,3},new int[] {7,9,8})));
            System.out.println(Arrays.toString(GetFirstElements(new int[] {1},new int[] {2})));
            System.out.println(Arrays.toString(GetFirstElements(new int[] {1,7},new int[] {})));

        }
    }


