//Recursion-1 > array11

public class CountElevenInArray {
    public int countEleven(int[]nums, int index) {
        if (nums.length == index) {
            return 0;
        }
        if (nums[index] == 11) {
            return 1 + countEleven(nums, index + 1);
        }
        return countEleven(nums, index + 1);
    }
}