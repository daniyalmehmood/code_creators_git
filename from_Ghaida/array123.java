public class array123 {
    public static void main(String[] args) {
        System.out.println(array123(new int[] {1, 1, 2, 3, 1})); //true
        System.out.println(array123(new int[] {1, 1, 2, 4, 1})); //false
        System.out.println(array123(new int[] {1, 1, 2, 1, 2, 3})); //true
    }
    public static boolean array123(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                return true;
            }
        }
        return false;
    }
}
