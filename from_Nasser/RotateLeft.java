import java.util.Arrays;

public class RotateLeft {

    public int[] rotateLeft3(int[] nums) {
        int last=nums[0];
        int mid=nums[2];
        int first=nums[1];

        return new int[]{first,mid,last};
    }

}
