public class StartOne {
    public static int startOne(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(startOne(new int[]{1, 2, 3}, new int[]{1, 3}));
        System.out.println(startOne(new int[]{7, 2, 3}, new int[]{1}));
        System.out.println(startOne(new int[]{1, 2}, new int[]{}));
    }
}
