public class MatchEnds {//Array-2 > sameEnds
    public static void main(String[] args) {
        System.out.println(prefixEqualsSuffix(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));// → false
        System.out.println(prefixEqualsSuffix(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));// → true
        System.out.println(prefixEqualsSuffix(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));// → false
    }
    public static boolean prefixEqualsSuffix(int[] nums, int len) {
        if(len == 0) return true;
        if(len > nums.length) return false;

        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]){
                return false;
            }
        }
        return true;
    }
}