public class StartOne {
    public static int start1(int[] a, int[] b) {
        if ((a.length > 0 && a[0] == 1) && (b.length > 0 && b[0] == 1)) {
            return 2;
        } else if ((a.length > 0 && a[0] == 1) || (b.length > 0 && b[0] == 1)) {
            return 1;
        } else {
            return 0;
        }
    }
        public static void main(String[] args) {
            System.out.println(start1(new int[]{1, 2, 3},new int[]{1,3}));
            System.out.println(start1(new int[]{7, 2, 3},new int[]{1}));
            System.out.println(start1(new int[]{1, 2},new int[]{}));
        }
    }
