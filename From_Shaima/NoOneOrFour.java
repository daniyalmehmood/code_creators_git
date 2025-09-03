public class NoOneOrFour {
    public static boolean hasNoOnesOrFours(int[] nums) {
        int count1=0; // to count 1's in the array
        int count4=0;// to count 4's in the array
        for (int i=0 ; i<nums.length; i++){  // for loop to go through the array
            if (nums[i]==1) count1++;
            if (nums[i]==4) count4++;
        }
        return count1==0 || count4==0; // return tue if there is 1 and no 4 Or there is 4 and no 1
    }
    public static void main(String[] args) {
        System.out.println(hasNoOnesOrFours(new int[]{2, 3, 4}));
    }
}
