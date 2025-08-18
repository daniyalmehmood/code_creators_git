public class ZeroFront {

    public int[] moveZerosToFront(int[] nums) {
        int[] result=new int[nums.length];
        int pos=nums.length-1;
        for (int i=0; i<nums.length;i++){

            if (nums[i]!=0) {
                result[pos]=nums[i];
                pos--;
            }
        }
        return result;
    }

}
