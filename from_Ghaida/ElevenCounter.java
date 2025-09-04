public class ElevenCounter {//Recursion-1 > array11
    public static void main(String[] args) {
        System.out.println(countElevens(new int[]{1, 2, 11}, 0));// → 1
        System.out.println(countElevens(new int[]{11, 11}, 0));// → 2
        System.out.println(countElevens(new int[]{1, 2, 3, 4}, 0));// → 0
    }
    public static int countElevens(int[] nums, int index) {
        if(index >= nums.length){
            return 0;
        }
        if(nums[index] == 11){
            return 1 + countElevens(nums, index + 1);
        }
        return countElevens(nums, index + 1);
    }
}