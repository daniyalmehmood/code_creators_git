public class RotateLeft {
    public static void main(String[] args) {
        System.out.println(moveFirstToEnd(new int [] {1, 2, 3}));// → [2, 3, 1]
        System.out.println(moveFirstToEnd(new int[] {5, 11, 9}));// → [11, 9, 5]
        System.out.println(moveFirstToEnd(new int[]{7, 0, 0}));// → [0, 0, 7]);
    }
    public static int[] moveFirstToEnd(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }
}
