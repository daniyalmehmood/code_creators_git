public class PostFour {

    public int[] elementsAfterLastFour(int[] nums) {

        int index=0;
        for (int i=nums.length-1 ;i>=0; i--){

            if (nums[i]==4) {
                index=nums.length-1-i;
                break;
            }
        }

        int[] result= new int[index];
        for (int j=0; j<result.length;j++){
            result[j]=nums[j+nums.length-index];
        }
        return result;
    }

}
