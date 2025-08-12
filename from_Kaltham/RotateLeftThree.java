public class RotateLeftThree {
    public int[]rotateLeft3(int[]nums) {
        int[]newArray = new int[3];
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            newArray[j] = nums[i];
            j++;
        }
        newArray[newArray.length - 1] = nums[0];
        return newArray;
    }
}