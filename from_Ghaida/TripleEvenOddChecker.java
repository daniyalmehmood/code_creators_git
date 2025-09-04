public class TripleEvenOddChecker {//Array-2 > modThree
    public static void main(String[] args) {
        System.out.println(hasTripleEvenOrOdd(new int[]{2, 1, 3, 5}));// → true
        System.out.println(hasTripleEvenOrOdd(new int[]{2, 1, 2, 5}));// → false
        System.out.println(hasTripleEvenOrOdd(new int[]{2, 4, 2, 5}));// → true
    }
    public static boolean hasTripleEvenOrOdd(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] % 2 == nums[i + 1] % 2 && nums[i + 1] % 2 == nums[i + 2] % 2){
                return true;
            }
        }
        return false;
    }
}