public class Sum28 {
    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            if (n == 2) sum += 2;
        }
        return sum == 8;
    }

    public static void main(String[] args) {
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2}));
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        System.out.println(sum28(new int[]{1, 2, 3, 4}));
    }
}