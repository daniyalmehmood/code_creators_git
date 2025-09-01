public class TwoOrFourTwins {
    public static boolean hasEitherTwoOrFourTwins(int[] nums) {
        int pairOfTwo=0;
        int pairOfFour=0;
        for(int i=0 ; i< nums.length-1 ; i++){
            if (nums[i]==2 && nums[i+1]==2 ) pairOfTwo++;
            if (nums[i]==4 && nums[i+1]==4) pairOfFour++;
        }
        if(pairOfTwo==0 && pairOfFour!=0 ) return true;
        if(pairOfTwo!=0 && pairOfFour==0 ) return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasEitherTwoOrFourTwins(new int[]{1, 2, 2}));
        System.out.println(hasEitherTwoOrFourTwins(new int[]{4, 4, 1}));
        System.out.println(hasEitherTwoOrFourTwins(new int[]{4, 4, 1, 2, 2}));
    }
}
