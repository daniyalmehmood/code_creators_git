import java.util.Arrays;

public class MidThree {
    public static int[] midThree(int[] nums) {
        int middle = nums.length / 2;
        int middleArray[] = new int[3];
        middleArray[0] = nums[middle - 1];
        middleArray[1] = nums[middle];
        middleArray[2] = nums[middle + 1];
        return middleArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3})));
    }
}
