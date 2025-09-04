public class MatchingEndsValidator {
    public static boolean hasSameEnds(int[] nums, int len) {
        for (int i=0 ; i< len ; i++){ // use for loop to go through the array
            if (nums[i]!= nums[nums.length - len + i]) return false; // checking while the first and last elements equality
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(hasSameEnds(new int[]{5, 6, 45, 99, 13, 5, 6},1));
    }
}
