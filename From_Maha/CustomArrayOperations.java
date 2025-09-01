public class CustomArrayOperations {
    public int[] withoutTen(int[] nums) {
        int[] newArray = new int[nums.length]; // new array to store result
        int index = 0;                         // tracks next position for non-10 numbers
        // First pass: place all non-10 numbers at the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                newArray[index] = nums[i];
                index++;
            }
        }
        // Remaining positions are already 0 by default
        return newArray;
    }
}
