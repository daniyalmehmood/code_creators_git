import java.util.Arrays;

public class FillZerosWithRightOddMax {
    public static int[] replaceZerosWithLargestOddToRight(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==0){
                int theLargestOdd=0;
                for(int j=i+1 ; j<nums.length ; j++){
                    if(nums[j]%2!=0){
                        if(theLargestOdd<nums[j]){
                            theLargestOdd=nums[j];
                        }
                    }
                }
                nums[i]=theLargestOdd;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceZerosWithLargestOddToRight(new int[]{0, 5, 0, 3})));
        System.out.println(Arrays.toString(replaceZerosWithLargestOddToRight(new int[]{0, 4, 0, 3})));
        System.out.println(Arrays.toString(replaceZerosWithLargestOddToRight(new int[]{0, 1, 0})));
    }
}
