public class GroupSum5 {
  public static void main(String[] args) {
    System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 19));
    System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 17));
    System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 12));
  }

  public static boolean groupSum5(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;

    if (nums[start] % 5 == 0) {
      if (start + 1 < nums.length && nums[start + 1] == 1)
        return groupSum5(start + 2, nums, target - nums[start]);
      return groupSum5(start + 1, nums, target - nums[start]);
    }

    if (groupSum5(start + 1, nums, target - nums[start])) return true;
    return groupSum5(start + 1, nums, target);
  }
}