public class NumberRangeSelector {
    public int[] isInEndyRange(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isEndy(nums[i])) {
                result[index] = nums[i];
                index++;
                if (index == count) {
                    break;
                }
            }
        }

        return result;
    }

    public boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }

}
