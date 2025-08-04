public class HasTwoSevenOne {

    public static boolean hasTwoSevenOne(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            if (nums[i + 1] == x + 5 && Math.abs(nums[i + 2] - (x - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        System.out.println(HasTwoSevenOne.hasTwoSevenOne(new int[]{1, 2, 7, 1}));
        System.out.println(HasTwoSevenOne.hasTwoSevenOne(new int[]{1, 2, 8, 1}));
        System.out.println(HasTwoSevenOne.hasTwoSevenOne(new int[]{3, 8, 2}));
        System.out.println(HasTwoSevenOne.hasTwoSevenOne(new int[]{2, 7, 3}));
        System.out.println(HasTwoSevenOne.hasTwoSevenOne(new int[]{2, 7, -1}));
        System.out.println(HasTwoSevenOne.hasTwoSevenOne(new int[]{4, 5, 3, 8, 0}));
        System.out.println(HasTwoSevenOne.hasTwoSevenOne(new int[]{1, 1, 4, 9, 4, 9, 2}));
    }
}
