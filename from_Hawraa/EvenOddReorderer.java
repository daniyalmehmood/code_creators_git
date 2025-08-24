// Array-2 > evenOdd
public class EvenOddReorderer {
    public int[] separateEvenOdd(int[] nums) {
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[evenIndex] = nums[i];
                evenIndex++;
            } else {
                result[oddIndex] = nums[i];
                oddIndex--;
            }
        }
        return result;
    }

}
