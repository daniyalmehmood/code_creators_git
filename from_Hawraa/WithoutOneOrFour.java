// Array-2 > no14
public class WithoutOneOrFour {
    public static boolean hasOnesOrFour(int[] nums) {
        boolean containsOne = false;;
        boolean containsFour = false;;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                containsOne = true;
            }
            if (nums[i] == 4) {
                containsFour = true;
            }
        }
        return !(containsOne && containsFour);
    }

    public static void main(String[] args){
        System.out.println(hasOnesOrFour(new int[]{1, 2, 3}));
        System.out.println(hasOnesOrFour(new int[]{1, 2, 3, 4}));
        System.out.println(hasOnesOrFour(new int[]{2, 3, 4}));
    }
}
