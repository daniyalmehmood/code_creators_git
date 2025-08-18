public class ShiftLeft {

    public int[] shiftArrayLeft(int[] nums) {
        int[] result= new int[nums.length];
        for (int i=0; i<nums.length-1; i++){

            result[i]=nums[i+1];
        }
        if (nums.length>0) result[result.length-1]=nums[0];

        return result;
    }

}
