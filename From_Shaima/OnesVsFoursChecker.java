public class OnesVsFoursChecker {
    public static boolean validateMoreOnes(int[] nums) {
        int count1=0;// initializing variable to count 1's in the array
        int count4=0;// initializing variable to count 4's in the array
        for (int i=0 ; i<=nums.length-1; i++){ //use for loop to go through the array
            if (nums[i]==1) count1++;
            if (nums[i]==4) count4++;
        }
        if (count1>count4 ) return true; // 1 is more than 4
        return false;
    }
    public static void main(String[] args) {
        System.out.println(validateMoreOnes(new int[]{1, 4, 1}));
    }
}
