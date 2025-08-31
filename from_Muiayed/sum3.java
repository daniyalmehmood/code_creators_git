public class sum3 {
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static void main(String[] args) {
        sum3 s = new sum3();
        System.out.println(s.sum3(new int[]{1, 2, 3}));  // 6
        System.out.println(s.sum3(new int[]{5, 11, 2})); // 18
        System.out.println(s.sum3(new int[]{7, 0, 0}));  // 7
    }
}