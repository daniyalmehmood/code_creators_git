public class SplitArray {
  public static void main(String[] args) {
    System.out.println(splitArray(new int[]{2, 2}));
    System.out.println(splitArray(new int[]{2, 3}));
    System.out.println(splitArray(new int[]{5, 2, 3}));
  }

  public static boolean splitArray(int[] nums) {
    return splitHelper(nums, 0, 0, 0);
  }

  private static boolean splitHelper(int[] nums, int index, int sum1, int sum2) {
    if (index == nums.length) return sum1 == sum2;
    return splitHelper(nums, index + 1, sum1 + nums[index], sum2) ||
           splitHelper(nums, index + 1, sum1, sum2 + nums[index]);
  }
}