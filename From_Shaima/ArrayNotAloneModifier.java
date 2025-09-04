import java.util.Arrays;
public class ArrayNotAloneModifier {
    public static int[] replaceAloneValuesWithLargerNeighbor(int[] nums, int val) {
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i] == val && nums[i - 1] != val && nums[i + 1] != val){ // check if the val is alone
                if(nums[i-1] > nums[i+1]) nums[i] = nums[i-1]; // make the val is equal to large neighbor
                if(nums[i-1] < nums[i+1]) nums[i] = nums[i+1];

            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] result = replaceAloneValuesWithLargerNeighbor(new int[]{1, 2, 3},2);
        System.out.println(Arrays.toString(result));
    }

}
