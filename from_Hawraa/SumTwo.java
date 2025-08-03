public class SumTwo {
    public static int sumFirstTwo(int[] nums) {
        if(nums.length >= 2){
            return nums[0] + nums[1];
        }
        else if (nums.length == 1){
            return nums[0];
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(sumFirstTwo(new int[]{1, 2, 3}));
        System.out.println(sumFirstTwo(new int[]{1, 1}));
        System.out.println(sumFirstTwo(new int[]{1, 1, 1, 1}));
    }
}
