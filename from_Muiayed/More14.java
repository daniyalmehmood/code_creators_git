public class More14 {
    public static boolean more14(int[] nums) {
        int ones = 0;
        int fours = 0;
        for (int n : nums) {
            if (n == 1) ones++;
            if (n == 4) fours++;
        }
        return ones > fours;
    }

    public static void main(String[] args) {
        System.out.println(more14(new int[]{1, 4, 1}));
        System.out.println(more14(new int[]{1, 4, 1, 4}));
        System.out.println(more14(new int[]{1, 1}));
    }
}