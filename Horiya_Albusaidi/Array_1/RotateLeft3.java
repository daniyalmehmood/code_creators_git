package Array_1;

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int [] rotateLeft=new int[nums.length];
        rotateLeft[0]=nums[1];
        rotateLeft[1]=nums[2];
        rotateLeft[2]=nums[0];
        return rotateLeft;
    }

}
