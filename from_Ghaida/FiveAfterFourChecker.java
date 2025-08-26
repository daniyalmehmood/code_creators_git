import java.util.Arrays;

public class FiveAfterFourChecker {//Array-3 > fix45
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fourFiveReorder(new int[]{5, 4, 9, 4, 9, 5})));//  [9, 4, 5, 4, 5, 9]
        System.out.println(Arrays.toString(fourFiveReorder(new int[]{1, 4, 1, 5})));//  [1, 4, 5, 1]
        System.out.println(Arrays.toString(fourFiveReorder(new int[]{1, 4, 1, 5, 5, 4, 1})));// [1, 4, 5, 1, 1, 4, 5]
    }
    public static int[] fourFiveReorder(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 4){
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        int valueAfterThree = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = valueAfterThree;
                    }
                }
            }
        }
        return nums;
    }
}