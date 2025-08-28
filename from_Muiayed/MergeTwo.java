import java.util.Arrays;

public class MergeTwo {
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] res = new String[n];
        int ia = 0, ib = 0;
        for (int i = 0; i < n; i++) {
            if (ib >= b.length || (ia < a.length && a[ia].compareTo(b[ib]) < 0)) {
                res[i] = a[ia++];
            } else if (ia >= a.length || (ib < b.length && b[ib].compareTo(a[ia]) < 0)) {
                res[i] = b[ib++];
            } else {               // equal
                res[i] = a[ia++];
                ib++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeTwo(new String[]{"a","c","z"}, new String[]{"b","f","z"}, 3)));
        System.out.println(Arrays.toString(mergeTwo(new String[]{"a","c","z"}, new String[]{"c","f","z"}, 3)));
        System.out.println(Arrays.toString(mergeTwo(new String[]{"f","g","z"}, new String[]{"c","f","g"}, 3)));
    }
}