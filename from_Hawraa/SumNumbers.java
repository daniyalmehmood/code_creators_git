// Array-2 > sum13
public class SumNumbers {
    public static int sumExcludingThirteen(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13){
                i++;
            }
            else{
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(sumExcludingThirteen(new int[]{1, 2, 2, 1}));
        System.out.println(sumExcludingThirteen(new int[]{1, 1}));
        System.out.println(sumExcludingThirteen(new int[]{1, 2, 2, 1, 13}));
    }
}
