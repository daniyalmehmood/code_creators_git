package Array_1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int[] revers =new int[nums.length];
        revers[0]=nums[2];
        revers[1]=nums[1];
        revers[2]=nums[0];
        return revers;
    }

}
