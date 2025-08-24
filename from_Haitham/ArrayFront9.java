public class ArrayFront9 {
public boolean arrayFront9(int[] nums) {

        int arraySize = 4;
        if (arraySize > nums.length) arraySize = nums.length;
        for (int i = 0; i < arraySize; i++) {
            if (nums[i] == 9) return true;
        }
        return false;

    }
	}
