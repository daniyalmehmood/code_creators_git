public class NoTriples {
    public static void main(String[] args) {
        System.out.println(noTriples(new int[] {1, 1, 2, 2, 1})); //true
        System.out.println(noTriples(new int[] {1, 1, 2, 2, 2, 1})); //false
        System.out.println(noTriples(new int[] {1, 1, 1, 2, 2, 2, 1})); //false
    }
    public static boolean noTriples(int[] nums) {
        for (int i= 0; i < nums.length - 2; i++){
            if (nums[i] == nums[i + 1] && nums[i] == nums[i+2]) {
                return false;
            }
        }
        return true;
    }
}
