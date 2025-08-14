public class MiddleElementsOfArray {
    public static void main(String[] args) {
        System.out.println(getMiddleElements(new int[]{1, 2, 3, 4}));//[2, 3]
        System.out.println(getMiddleElements(new int[]{7, 1, 2, 3, 4, 9}));//[1, 2]}));//[2, 3]
        System.out.println(getMiddleElements(new int[]{1, 2}));//[1, 2]
    }
    public static int[] getMiddleElements(int[] nums) {
        int middleElementOfArray = nums.length / 2;
        return new int[]{nums[middleElementOfArray - 1], nums[middleElementOfArray]};
    }
}
