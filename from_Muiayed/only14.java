public class only14 {
    public static boolean only14(int[] nums) {
        for (int n : nums) {
            if (n != 1 && n != 4) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(only14(new int[]{1, 4, 1, 4}));
        System.out.println(only14(new int[]{1, 4, 2, 4}));
        System.out.println(only14(new int[]{1, 1}));
    }
}