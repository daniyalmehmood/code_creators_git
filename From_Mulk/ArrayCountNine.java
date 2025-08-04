public class ArrayCountNine {
    public int count9InArray(int[] nums) {
        int count9 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count9++;
            }
        }
        return count9;
    }
}