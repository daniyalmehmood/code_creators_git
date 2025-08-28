import java.util.Arrays;

public class commonTwo {
    public static int commonTwo(String[] a, String[] b) {
        int ia = 0, ib = 0, count = 0;
        while (ia < a.length && ib < b.length) {
            int cmp = a[ia].compareTo(b[ib]);
            if (cmp == 0) {
                count++;
                String val = a[ia];
                while (ia < a.length && a[ia].equals(val)) ia++;
                while (ib < b.length && b[ib].equals(val)) ib++;
            } else if (cmp < 0) {
                ia++;
            } else {
                ib++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(commonTwo(new String[]{"a","c","x"}, new String[]{"b","c","d","x"}));
        System.out.println(commonTwo(new String[]{"a","c","x"}, new String[]{"a","b","c","x","z"}));
        System.out.println(commonTwo(new String[]{"a","b","c"}, new String[]{"a","b","c"}));
    }
}