import java.util.Arrays;

public class ElementsAfterLastFour {
    public static int[] getAllElementsThatComeAfterTheLastFour(int[] nums) {
        int lastFour = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                lastFour = i;
                // break;
            }
        }
        int lengthOfNewArray = nums.length - lastFour - 1;
        int theResult[] = new int[lengthOfNewArray];
        for (int i = 0; i < lengthOfNewArray; i++) {
            theResult[i] = nums[lastFour + 1 + i];
        }
        return theResult;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAllElementsThatComeAfterTheLastFour(new int[]{2, 4, 1, 2})));
        System.out.println(Arrays.toString(getAllElementsThatComeAfterTheLastFour(new int[]{4, 1, 4, 2})));
        System.out.println(Arrays.toString(getAllElementsThatComeAfterTheLastFour(new int[]{4, 4, 1, 2, 3})));
    }
}