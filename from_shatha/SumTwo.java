public class SumTwo {
    public static int sum_first_two_elements(int[] nums) {

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }
        }
        public static void main(String[] args){
        System.out.println(sum_first_two_elements(new int[]{1,2,3,}));
        System.out.println(sum_first_two_elements(new int[]{1,1}));
        System.out.println(sum_first_two_elements(new int[]{ 1, 1,1,1}));
        }
    }

