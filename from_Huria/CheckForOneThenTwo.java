public class CheckForOneThenTwo {
    public static boolean hasOneBeforeTwo(int[] nums) {
        int hasOne=0;
        for(int i=0 ; i< nums.length-1 ; i++){
            if (nums[i]==1 ){
                hasOne++;
            }
            if  (nums[i+1]==2 && hasOne>0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasOneBeforeTwo(new int[]{1, 3, 2}));
        System.out.println(hasOneBeforeTwo(new int[]{3, 1, 2}));
        System.out.println(hasOneBeforeTwo(new int[]{3, 1, 4, 5, 2}));
    }
}
