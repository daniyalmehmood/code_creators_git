public class Array6 {
  public static void main(String[] args) {
    System.out.println(array6(new int[]{1, 6, 4}, 0));
    System.out.println(array6(new int[]{1, 4}, 0));
    System.out.println(array6(new int[]{6}, 0));
  }

  public static boolean array6(int[] nums, int index) {
    if (index >= nums.length) return false;
    if (nums[index] == 6) return true;
    return array6(nums, index + 1);
  }
}