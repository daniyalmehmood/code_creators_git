public class ArrayFront9 {
    public static void main(String[] args) {
        System.out.println(arrayFront9(new int[] {1, 2, 9, 3, 4})); //true
        System.out.println(arrayFront9(new int[] {1, 2, 3, 4, 9})); //false
        System.out.println(arrayFront9(new int[] {1, 2, 3, 4, 5})); //false
    }
    public static boolean arrayFront9(int[] nums) {
        int limit = Math.min(nums.length, 4);
        for (int i = 0; i < limit; i++){
            if(nums[i] == 9){
                return true;
            }
        }
        return false;
    }
}
