public class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        int len = nums.length;
        if (len < 2) return false;

        if ((nums[0] == 1 && nums[1] == 3) ||
                (len > 2 && nums[1] == 1 && nums[2] == 3)) {
            return true;
        }

        return nums[len - 2] == 1 && nums[len - 1] == 3;
    }

    public static void main(String[] args) {
        Unlucky1 u = new Unlucky1();
        System.out.println(u.unlucky1(new int[]{1, 3, 4, 5}));
        System.out.println(u.unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(u.unlucky1(new int[]{1, 1, 1}));
    }
}