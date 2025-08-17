public class CountEvens {//Array-2 > countEvens
    public static void main(String[] args) {
        System.out.println(countEvenNumbers(new int[] {2, 1, 2, 3, 4}));// → 3
        System.out.println(countEvenNumbers(new int[] {2, 2, 0}));// → 3
        System.out.println(countEvenNumbers(new int[] {1, 3, 5}));// → 0
    }
    public static int countEvenNumbers(int[] nums) {
        int countEvens = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                countEvens++;
            }
        }
        return countEvens;
    }
}