public class has12 {
    public static boolean has12(int[] nums) {
        boolean found1 = false;
        for (int n : nums) {
            if (n == 1) found1 = true;
            if (found1 && n == 2) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(has12(new int[]{1, 3, 2}));
        System.out.println(has12(new int[]{3, 1, 2}));
        System.out.println(has12(new int[]{3, 1, 4, 5, 2}));
    }
}