public class HasNumbers271 {
    public static boolean has271(int[] nums) {


            for (int i = 0; i < nums.length - 2; i++) {
                int value = nums[i];
                if (nums[i+1] == value + 5 && Math.abs(nums[i + 2] - (value - 1)) <= 2) {
                    return true;
                }
            }
            return false;

        }



    public static void main(String[] args) {
        System.out.println(has271(new int[]{1, 2, 7, 1}));
        System.out.println(has271(new int[]{2, 7, 1}));
        System.out.println(has271(new int[] {2,3,4,6,7}));
    }
}
