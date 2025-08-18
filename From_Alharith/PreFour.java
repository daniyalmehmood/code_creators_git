public class PreFour {

    public int[] elementsBeforeFirstFour(int[] nums) {
        int index=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==4) {
                index=i;
                break;
            }

        }

        int[] result=new int[index];
        for (int j=0; j<index; j++){
            result[j]= nums[j];

        }
        return result;
    }

}
