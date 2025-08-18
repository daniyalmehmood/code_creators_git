public class EvenOdd {

    public int[] evensFirstOddsLast(int[] nums) {
        int posOdd=nums.length-1;
        int posEven=0;
        int[] result=new int[nums.length];

        for (int i=0;i<nums.length;i++){

            if (nums[i]%2 ==0) {
                result[posEven]=nums[i];
                posEven++;
            }
            else {
                result[posOdd]=nums[i];
                posOdd--;
            }
        }
        return result;
    }

}
