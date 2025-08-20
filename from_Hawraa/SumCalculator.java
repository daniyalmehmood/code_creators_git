// Array-2 > sum67
public class SumCalculator {
    public static int sumIgnoringSixToSeven(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == 6) {
                while (i < nums.length && nums[i] != 7) {
                    i++;
                }
                i++;
            } else {
                sum += nums[i];
                i++;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(sumIgnoringSixToSeven(new int[]{1, 2, 2}));
        System.out.println(sumIgnoringSixToSeven(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(sumIgnoringSixToSeven(new int[]{1, 1, 6, 7, 2}));
    }
}
