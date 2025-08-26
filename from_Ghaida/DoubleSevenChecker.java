public class DoubleSevenChecker {//Array-2 > has77
    public static void main(String[] args) {
        System.out.println(hasDoubleSeven(new int[]{1, 7, 7}));// → true
        System.out.println(hasDoubleSeven(new int[]{1, 7, 1, 7}));// → true
        System.out.println(hasDoubleSeven(new int[]{1, 7, 1, 1, 7}));// → false
    }
    public static boolean hasDoubleSeven(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i < nums.length - 1 && nums[i] == 7 && nums[i + 1] == 7 ){//check if there is 7 after 7
                return true;
            }
            if(i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7 ){//check for 7s with one number in between
                return true;
            }
        }
        return false;
    }
}