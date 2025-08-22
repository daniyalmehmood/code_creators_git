public class Reverse3 {
    public int[] Reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public static void main(String[] args) {
        Reverse3 r = new Reverse3();
        int[] out = r.Reverse3(new int[]{1, 2, 3});
        System.out.println(out[0] + " " + out[1] + " " + out[2]); // 3 2 1
    }
}