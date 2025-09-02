public class Split53 {
  public static void main(String[] args) {
    System.out.println(split53(new int[]{1, 1}));
    System.out.println(split53(new int[]{1, 1, 1}));
    System.out.println(split53(new int[]{2, 4, 2}));
  }

  public static boolean split53(int[] nums) {
    return helper(nums, 0, 0, 0);
  }

  private static boolean helper(int[] nums, int index, int sum1, int sum2) {
    if (index == nums.length) return sum1 == sum2;

    int val = nums[index];
    if (val % 5 == 0) return helper(nums, index + 1, sum1 + val, sum2);
    if (val % 3 == 0) return helper(nums, index + 1, sum1, sum2 + val);

    return helper(nums, index + 1, sum1 + val, sum2) ||
           helper(nums, index + 1, sum1, sum2 + val);
  }
}