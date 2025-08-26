public class OnesVsFours {//Array-2 > more14
    public static void main(String[] args) {
        System.out.println(hasMoreOnes(new int[]{1, 4, 1}));// → true
        System.out.println(hasMoreOnes(new int[]{1, 4, 1, 4}));// → false
        System.out.println(hasMoreOnes(new int[]{1, 1}));// → true
    }
    public static boolean hasMoreOnes(int[] nums) {
        int countOne = 0;
        int countFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                countOne++;
            }
            if(nums[i] == 4){
                countFour++;
            }
        }
        return countOne > countFour;
    }
}