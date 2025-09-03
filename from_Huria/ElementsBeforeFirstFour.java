import java.util.Arrays;

public class ElementsBeforeFirstFour {
    public static int[] getElementsBeforeFirstFour(int[] nums) {
        int hasFour = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                hasFour = i;
                break;
            }
        }
        int theResult[] = new int[hasFour];
        for (int i = 0; i < hasFour; i++) {
            theResult[i] = nums[i];
        }
        return theResult;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getElementsBeforeFirstFour(new int[]{1, 2, 4, 1})));
        System.out.println(Arrays.toString(getElementsBeforeFirstFour(new int[]{3, 1, 4})));
        System.out.println(Arrays.toString(getElementsBeforeFirstFour(new int[]{1, 4, 4})));
    }
}
