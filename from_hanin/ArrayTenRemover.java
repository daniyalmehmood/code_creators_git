//Array-2 > withoutTen
public class ArrayTenRemover {
    public static int[] withoutTen(int[] nums) {
        int[] newArray = new int[nums.length];
        int indx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                newArray[indx] = nums[i];
                indx++;
            }
        }
        return newArray;
    }

}
