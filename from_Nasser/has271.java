public class has271 {

    public static boolean has2711(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int val = nums[i];
            if (nums[i + 1] == val + 5 && Math.abs(nums[i + 2] - (val - 1)) <= 2){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(has2711(new int[]{1, 2, 7, 1}));
        System.out.println(has2711(new int[]{1, 2, 8, 1}));
        System.out.println(has2711(new int[]{2, 7, 1}));

    }
}

