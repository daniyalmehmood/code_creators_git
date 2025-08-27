//Recursion-1 > array6

public class ArrayContainsSix {
    public boolean hasSix(int[]nums, int index) {
        if (nums.length == index) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return hasSix(nums, index + 1);

    }

}