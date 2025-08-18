import java.util.Arrays;

public class AloneReplacer {//Array-2 > notAlone
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceIfNotAlone(new int[]{1, 2, 3}, 2)));// → [1, 3, 3]
        System.out.println(Arrays.toString(replaceIfNotAlone(new int[]{1, 2, 3, 2, 5, 2}, 2)));// → [1, 3, 3, 5, 5, 2]
        System.out.println(Arrays.toString(replaceIfNotAlone(new int[]{3, 4}, 3)));// → [3, 4]
    }
    public static int[] replaceIfNotAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }
}
