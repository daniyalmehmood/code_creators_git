public class SixInArray {//Recursion-1 > array6
    public static void main(String[] args) {
        System.out.println(hasSix(new int[]{1, 6, 4}, 0));// → true
        System.out.println(hasSix(new int[]{1, 4}, 0));// → false
        System.out.println(hasSix(new int[]{6}, 0));// → true
    }
    public static boolean hasSix(int[] nums, int index) {
        if(index >= nums.length){
            return false;
        }
        if(nums[index] == 6){
            return true;
        }
        return hasSix(nums, index + 1);
    }
}