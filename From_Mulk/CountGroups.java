//Array-3 > countClumps
public class CountGroups {
    public int countAdjacentElements(int[] nums) {
        int counti = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                counti++;
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return counti;
    }
}