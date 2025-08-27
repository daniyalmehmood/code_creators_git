public class RemoveTens {
    public int[]removeTen(int[]nums) {
        int[]newArray = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                newArray[count] = nums[i];
                count++;
            }
        }
        return newArray;

    }
}