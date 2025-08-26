public class ThreeCounter {//Array-2 > haveThree
    public static void main(String[] args) {
        System.out.println(hasExactThree(new int[]{3, 1, 3, 1, 3}));// → true
        System.out.println(hasExactThree(new int[]{3, 1, 3, 3}));// → false
        System.out.println(hasExactThree(new int[]{3, 4, 3, 3, 4}));// → false
    }
    public static boolean hasExactThree(int[] nums) {
        int countThree = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 3){
                if(i < nums.length - 1 && nums[i + 1] == 3){
                    return false;
                }
                countThree++;
            }
        }
        return countThree == 3;
    }
}