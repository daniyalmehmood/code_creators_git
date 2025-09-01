public class OneFourFilter {
    public static boolean containsOnlyOneAndFour(int[] nums) {
        for(int i=0 ; i< nums.length ; i++){
            if (nums[i]!=1 && nums[i]!=4) return false;

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(containsOnlyOneAndFour(new int[]{1, 4, 1, 4}));
        System.out.println(containsOnlyOneAndFour(new int[]{1, 4, 2, 4}));
        System.out.println(containsOnlyOneAndFour(new int[]{1, 1}));
    }
}
