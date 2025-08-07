public class MakeLast {

    public int[] makeLastWithLastValue(int[] nums) {
        int[] DoubleLength= new int[nums.length*2];
        DoubleLength[DoubleLength.length-1]=nums[nums.length-1];
        return DoubleLength;
    }

}
