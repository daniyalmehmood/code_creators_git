public class Pattern271Checker {
    public static boolean check271Pattern(int[] nums) {
        for (int i=0 ; i<nums.length-2 ; i++){
            if ((nums[i + 1] == (nums[i] + 5)) && (nums[i + 2] >= nums[i] - 3) && (nums[i + 2] <= nums[i] + 1)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(check271Pattern(new int[]{1, 2, 7, 1}));
        System.out.println(check271Pattern(new int[]{1, 2, 8, 1}));
        System.out.println(check271Pattern(new int[]{2, 7, 1}));
    }
}
