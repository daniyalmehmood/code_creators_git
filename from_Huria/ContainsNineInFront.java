public class ContainsNineInFront {
    public static boolean contains9InFront(int[] nums) {
        int n = nums.length;
        if (n > 4)
            n = 4;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
        
    public static void main(String[] args) {

        System.out.println(contains9InFront(new int[]{1, 2, 9, 3, 4}));
        System.out.println(contains9InFront(new int[]{1, 2, 3, 4, 9}));
        System.out.println(contains9InFront(new int[]{1, 2, 3, 4, 5}));
        System.out.println(contains9InFront(new int[]{9, 2, 3}));
        System.out.println(contains9InFront(new int[]{1, 9, 9}));
        System.out.println(contains9InFront(new int[]{}));
        System.out.println(contains9InFront(new int[]{3, 9, 2, 3, 3}));

    }
}
