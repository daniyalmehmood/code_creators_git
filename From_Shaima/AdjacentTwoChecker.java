public class AdjacentTwoChecker {
    public static boolean allTwosArePaired(int[] nums) {
        for (int i=0 ; i<nums.length ; i++){ // use for loop to go through the array
            if (nums[i]==2){ // check if there is any 2 in element is followed by any number neither than 2
                if (!(i<nums.length-1&&nums[i+1]==2) && !(i>0&& nums[i-1]==2)){
                    return false; // make it false
                }
            }
        }
        return true; // otherwise 2 is followed by another 2
    }
    public static void main(String[] args) {
        System.out.println(allTwosArePaired(new int[]{4, 2, 2, 3}));
    }
}
