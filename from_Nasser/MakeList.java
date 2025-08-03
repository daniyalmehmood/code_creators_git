public class MakeList {

    public int[] makeLast(int[] nums) {

        int length = (nums.length) * 2;

        int[] arrayD = new int[length];

        arrayD[arrayD.length-1]=nums[nums.length-1];

        return arrayD;
    }


}

