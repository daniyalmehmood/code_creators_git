public class ArrayCountNine {
    public int count9InArray(int[] nums) {
        int countX = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                countX++;
            }
        }
        return countX;
    }
}