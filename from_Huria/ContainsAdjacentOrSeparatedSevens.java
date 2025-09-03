public class ContainsAdjacentOrSeparatedSevens {
    public static boolean containsAdjacentOrSeparatedSevens(int[] nums) {
        for(int i=0 ; i< nums.length-1 ; i++){
            if (nums[i]==7 && nums[i+1]==7) return true;
            if (i<nums.length-2 && nums[i]==7 && nums[i+2]==7) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsAdjacentOrSeparatedSevens(new int[]{1, 7, 7}));
        System.out.println(containsAdjacentOrSeparatedSevens(new int[]{1, 7, 1, 7}));
        System.out.println(containsAdjacentOrSeparatedSevens(new int[]{1, 7, 1, 1, 7}));
    }
}
