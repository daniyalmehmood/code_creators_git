import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapEnds {

    public int[] swapEnds(int[] nums) {

        int first=nums[0];
        int last=nums[nums.length-1];


        int [] result =new int[nums.length];

        result[0]=last;
        for(int i=1; i< nums.length-1;i++){

            result[i]=nums[i];
        }
        result[nums.length-1]=first;

        return result;
    }


}
