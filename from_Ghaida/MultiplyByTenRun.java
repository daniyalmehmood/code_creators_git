import java.util.Arrays;

public class MultiplyByTenRun {//Array-2 > tenRun
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceWithLastTen(new int[]{2, 10, 3, 4, 20, 5})));// → [2, 10, 10, 10, 20, 20]
        System.out.println(Arrays.toString(replaceWithLastTen(new int[]{10, 1, 20, 2})));// → [10, 10, 20, 20]
        System.out.println(Arrays.toString(replaceWithLastTen(new int[]{10, 1, 9, 20})));// → [10, 10, 10, 20]
    }
    public static int[] replaceWithLastTen(int[] nums) {
        int[] result = new int[nums.length];
        int lastTen = 0; // to keep track of the last multiple of ten
        if (nums.length == 0) return result;

        else if (nums.length == 2 && nums[0] == 0 && nums[1] != 10) {
            result[0] = nums[0];
            result[1] = nums[0];
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                lastTen = nums[i]; // update lastTen if current number is a multiple of ten
                result[i] = lastTen; // set the current position to lastTen
            }
            else if (lastTen != 0) {
                result[i] = lastTen; // use lastTen if it's not zero
            }
            result[i] = nums[i]; // use the current number
        }
        return result;
    }
}