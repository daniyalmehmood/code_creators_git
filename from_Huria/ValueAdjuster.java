import java.util.Arrays;

public class ValueAdjuster {
    public static int[] replaceAloneValuesWithLargerNeighbor(int[] nums, int val) {
        for(int i=1 ; i<nums.length-1 ; i++){
            if(nums[i]== val && nums[i]!= nums[i-1] && nums[i]!= nums[i+1]){
                if(nums[i-1]>nums[i+1]) nums[i]=nums[i-1];
                if(nums[i-1]<nums[i+1]) nums[i]=nums[i+1];
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceAloneValuesWithLargerNeighbor(new int[]{1, 2, 3}, 2)));
        System.out.println(Arrays.toString(replaceAloneValuesWithLargerNeighbor(new int[]{1, 2, 3, 2, 5, 2}, 2)));
        System.out.println(Arrays.toString(replaceAloneValuesWithLargerNeighbor(new int[]{3, 4}, 3)));
}
}