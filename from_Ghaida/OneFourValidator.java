public class OneFourValidator {//Array-2 > no14
    public static void main(String[] args) {
        System.out.println(checkNoOneFourTogether(new int[]{1, 2, 3}));// → true
        System.out.println(checkNoOneFourTogether(new int[]{1, 2, 3, 4}));// → false
        System.out.println(checkNoOneFourTogether(new int[]{2, 3, 4}));// → true
    }
    public static boolean checkNoOneFourTogether(int[] nums) {
        boolean hasOne = false;
        boolean hasFour = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                hasOne =  true;
            }
            if (nums[i] == 4) {
                hasFour = true;
            }
        }
        return !(hasOne && hasFour);
    }
}
