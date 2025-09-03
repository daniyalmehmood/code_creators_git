public class DoubleSevenChecker {
    public static  boolean containsDoubleSeven(int[] nums) {
        for (int i=0 ; i<nums.length-1 ; i++){ // for loop to go through the array
            if (nums[i]==7 && nums[i+1]==7) return true; // 7 is followed by 7
            if ( i+2<nums.length && nums[i]==7 && nums[i+2]==7) return true; // there are two 7's separated by one element
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDoubleSeven(new int[]{1, 7, 1, 1, 7}));
    }
}
