public class RotateLeftThree {
public int[] rotateLeft3(int[] nums) {
        int[] rotateNums = new int[3];
        rotateNums[0] = nums[1];
        rotateNums[1] = nums[2];
        rotateNums[2] = nums[0];
        return rotateNums;


    }
}
