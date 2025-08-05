public class MidThree {
public int[] midThree(int[] nums) {
        int middleElement = nums.length / 2;
        return new int[]{nums[middleElement - 1], nums[middleElement], nums[middleElement + 1]};
    }
}
