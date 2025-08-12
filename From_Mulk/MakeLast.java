public class MakeLast {
    public int[] makeArrayWithLastElementAtEnd(int[] nums) {
        if (nums.length >= 1) {
            int[] nums2 = new int[nums.length * 2];
            nums2[nums2.length - 1] = nums[nums.length - 1];
            return nums2;
        }
        return null;
    }
}
