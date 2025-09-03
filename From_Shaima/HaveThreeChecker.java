public class HaveThreeChecker {
    public static boolean hasExactlyThreeNonAdjacentThrees(int[] nums) {
        int count3=0;
        for (int i=0 ; i<nums.length; i++){ // go through the array to check if there is any 3
            if (nums[i]==3){
                count3++; // increment counting variable if there is 3
                if (i+1<nums.length && nums[i+1]==3) return false; // no 3's are next to each other
            }
        }
        return count3==3; // true if the array contain 3 , 3 times and not next to each other
    }
    public static void main(String[] args) {
        System.out.println(hasExactlyThreeNonAdjacentThrees(new int[]{3, 1, 3, 3}));
    }
}
