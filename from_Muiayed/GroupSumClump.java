public class GroupSumClump {
  public static void main(String[] args) {
    System.out.println(groupSumClump(0, new int[]{2, 4, 8}, 10));
    System.out.println(groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
    System.out.println(groupSumClump(0, new int[]{2, 4, 4, 8}, 14));
  }

  public static boolean groupSumClump(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;

    int i = start;
    int sum = 0;
    while (i < nums.length && nums[i] == nums[start]) {
      sum += nums[i];
      i++;
    }

    if (groupSumClump(i, nums, target - sum)) return true;
    return groupSumClump(i, nums, target);
  }
}