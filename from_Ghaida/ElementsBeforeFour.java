public class ElementsBeforeFour {//Array-2 > pre4
    public static void main(String[] args) {
        System.out.println(getElementsBeforeFour(new int[]{1, 2, 4, 1}));// → [1, 2]
        System.out.println(getElementsBeforeFour(new int[]{3, 1, 4}));// → [3, 1]
        System.out.println(getElementsBeforeFour(new int[]{1, 4, 4, 1}));// → [1, 4]}));// → [1]
    }
    public static int[] getElementsBeforeFour(int[] nums) {
        int count = 0;
        int[] result = new int[count];
        for (int num : nums) {
            if (num == 4) { //stop counting when num == 4
                break;
            }
            count++;// count how many numbers are not 4
        }
        for (int i = 0; i < count; i++) {
            result[i] = nums[i];
        }
        return result;
    }
}