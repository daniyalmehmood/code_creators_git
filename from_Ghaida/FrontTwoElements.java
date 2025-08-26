public class FrontTwoElements {//Array-1 > frontPiece
    public static void main(String[] args) {
        System.out.println(getFirstTwoElements(new int[]{1, 2, 3}));// → [1, 2]
        System.out.println(getFirstTwoElements(new int[]{1, 2}));// → [1, 2]
        System.out.println(getFirstTwoElements(new int[]{1}));// → [1]);
    }
    public static int[] getFirstTwoElements(int[] nums) {
        if(nums.length<2) {
            return nums;
        }
        return new int[] {nums[0], nums[1]};
    }
}
