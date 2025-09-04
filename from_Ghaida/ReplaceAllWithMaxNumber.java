public class ReplaceAllWithMaxNumber {
    public static void main(String[] args) {
        System.out.println(transformToMax(new int[]{1, 2, 3}));// → [3, 3, 3]
        System.out.println(transformToMax(new int[]{11, 5, 9}));// → 11, 11, 11]);
        System.out.println(transformToMax(new int[]{2, 11, 3}));// → [3, 3, 3]);
    }
    public static int[] transformToMax(int[] nums) {
        if(nums[0] > nums[nums.length - 1]){
            return new int[]{nums[0], nums[0], nums[0]};
        }
        return new int[]{nums[nums.length - 1], nums[nums.length - 1], nums[nums.length - 1]};
    }
}