public class OneBeforeTwo {
    public static boolean hasOneBeforeTwo(int[] nums) {
        for (int i=0 ; i<nums.length ; i++){ // for loop to go through the array from first index
            if (nums[i]==1){
                for (int j = i + 1; j < nums.length; j++) { // for loop to search for 2 in the array after catching 1
                    if (nums[j] == 2) return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasOneBeforeTwo(new int[]{3, 1, 4, 5, 2}));
    }
}
