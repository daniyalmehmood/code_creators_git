//Array-2 > evenOdd
public class EvenFirst {
    public int[] groupEvenBeforeOdd(int[] nums) {
        int index = 0;
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newArray[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                newArray[index] = nums[i];
                index++;

            }
        }
        return newArray;
    }

}