public class ArrayFrontNine {

    public boolean hasNineInFirstElements(int[] nums) {

        int length = nums.length;
        if (length > 4) length = 4;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }
}
