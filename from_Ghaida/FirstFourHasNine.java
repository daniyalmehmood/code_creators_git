public class FirstFourHasNine {
    public static void main(String[] args) {
        System.out.println(isNineInFront(new int[] {1, 2, 9, 3, 4})); //true
        System.out.println(isNineInFront(new int[] {1, 2, 3, 4, 9})); //false
        System.out.println(isNineInFront(new int[] {1, 2, 3, 4, 5})); //false
    }
    public static boolean isNineInFront(int[] nums) {
        int limit = Math.min(nums.length, 4);
        for (int i = 0; i < limit; i++){
            if(nums[i] == 9){
                return true;
            }
        }
        return false;
    }
}
