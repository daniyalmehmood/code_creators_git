public class LinearIn {
    public static boolean linearIn(int[] outer, int[] inner) {
        int o = 0, i = 0;

        while (o < outer.length && i < inner.length) {
            if (outer[o] < inner[i]) {
                o++;
            } else if (outer[o] == inner[i]) {
                o++;
                i++;
            } else {
                return false;
            }
        }
        return i == inner.length;
    }

    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }
}