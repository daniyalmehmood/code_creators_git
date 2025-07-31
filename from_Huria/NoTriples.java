public class HasNoTriples {
    public static boolean hasNoTriples(int[] nums) {

        if (nums.length < 3) {
            return true;
        } else {

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2])
                    return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(hasNoTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(hasNoTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(hasNoTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
        System.out.println(hasNoTriples(new int[]{1, 2, 1}));
        System.out.println(hasNoTriples(new int[]{1, 1}));
        System.out.println(hasNoTriples(new int[]{1}));
        System.out.println(hasNoTriples(new int[]{}));

    }
}
