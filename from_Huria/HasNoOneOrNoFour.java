public class HasNoOneOrNoFour {
    public static boolean hasNoOneOrNoFour(int[] nums) {
        int hasOne = 0;
        int hasFour = 0;
        for (int i=0; i<nums.length ; i++) {
            if (nums[i] == 1) {
                hasOne++;
            }
            if (nums[i] == 4) {
                hasFour++;
            }
        }
        if(hasOne==0 || hasFour==0) return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasNoOneOrNoFour(new int[]{1, 2, 3}));
        System.out.println(hasNoOneOrNoFour(new int[]{1, 2, 3, 4}));
        System.out.println(hasNoOneOrNoFour(new int[]{ 2, 3 ,4}));
        }
}
