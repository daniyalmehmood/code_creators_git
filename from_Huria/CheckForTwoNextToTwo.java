public class CheckForTwoNextToTwo {
    public static boolean hasTwoNextToTwo(int[] nums) {
        for(int i=0 ; i< nums.length-1 ; i++){
            if (nums[i]==2 && nums[i+1]==2)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasTwoNextToTwo(new int[]{1, 2, 2}));
        System.out.println(hasTwoNextToTwo(new int[]{1, 2, 1, 2}));
        System.out.println(hasTwoNextToTwo(new int[]{2, 1, 2}));
    }
}
