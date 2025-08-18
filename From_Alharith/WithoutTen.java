public class WithoutTen {

    public int[] removeTens(int[] nums) {
        int[] result=new int[nums.length];
        int posNo10=0;
        for(int i=0; i<nums.length;i++){

            if (nums[i]!=10) {
                result[posNo10]=nums[i];
                posNo10++;
            }
        }
        return result;
    }

}
