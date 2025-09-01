public class CountEvenIntegers {
    public static int countEvenValues(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countEvenValues(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvenValues(new int[]{2, 2, 0}));
        System.out.println(countEvenValues(new int[]{1, 3, 5}));
    }
}