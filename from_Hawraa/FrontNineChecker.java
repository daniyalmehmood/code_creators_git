public class FrontNineChecker {
    public static boolean frontNineChecker(int[] nums) {
        int array = nums.length;
        if (array > 4) {
            array = 4;
        }
        for (int i =0; i < array; i++){
            if(nums[i] == 9){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(frontNineChecker(new int[]{1, 2, 9, 3, 4}));
        System.out.println(frontNineChecker(new int[]{1, 2, 3, 4, 9}));
        System.out.println(frontNineChecker(new int[]{1, 2, 3, 4, 5}));
    }
}
