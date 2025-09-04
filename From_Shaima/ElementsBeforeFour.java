import java.util.Arrays;
public class ElementsBeforeFour{
    public static int[] getElementsBeforeFirstFour(int[] nums) {
        int hasFour = -1;
        for (int i = 0; i < nums.length; i++) { // use for loop to go through the array
            if (nums[i] == 4) { // check if the element is 4
                hasFour = i; // make the variable to hold the index of element 4
                break;
            }
        }
        int arrayWithoutFour[] = new int[hasFour]; // new array that contains all numbers before 4
        for (int i = 0; i < hasFour; i++) {
            arrayWithoutFour[i] = nums[i];
        }
        return arrayWithoutFour;
    }
    public static void main(String[] args) {
        int[] result = getElementsBeforeFirstFour(new int[]{1, 2, 4, 1});
        System.out.println(Arrays.toString(result));
    }
}
