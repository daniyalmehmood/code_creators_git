public class Has23 {
    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 ||
                nums[1] == 2 || nums[1] == 3;
    }

    public static void main(String[] args) {
        Has23 h = new Has23();
        System.out.println(h.has23(new int[]{2, 5}));
        System.out.println(h.has23(new int[]{4, 3}));
        System.out.println(h.has23(new int[]{4, 5}));
    }
}