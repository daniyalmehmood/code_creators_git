public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2 - 1;
        return new int[]{nums[mid], nums[mid + 1]};
    }

    public static void main(String[] args) {
        MakeMiddle mm = new MakeMiddle();
        int[] out = mm.makeMiddle(new int[]{1, 2, 3, 4});
        System.out.println(out[0] + " " + out[1]); // 2 3
    }
}