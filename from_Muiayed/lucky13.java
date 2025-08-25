public class lucky13 {
    public static boolean lucky13(int[] nums) {
        for (int n : nums) {
            if (n == 1 || n == 3) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(lucky13(new int[]{0, 2, 4}));
        System.out.println(lucky13(new int[]{1, 2, 3}));
        System.out.println(lucky13(new int[]{1, 2, 4}));
    }
}