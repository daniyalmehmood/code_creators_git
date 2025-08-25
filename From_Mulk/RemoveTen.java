//Array-2 > withoutTen
public class RemoveTen {
    public int[] removeTenFillWithZero(int[] nums) {
        int indexTen = 0;
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                newArray[indexTen] = nums[i];
                indexTen++;

            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                newArray[indexTen] = 0;
                indexTen++;
            }
        }

        return newArray;
    }
}