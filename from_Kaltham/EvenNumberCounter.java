public class EvenNumberCounter {
    public int countEvenNumbers(int[]nums) {
        int countEvenNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                countEvenNumbers++;
            }
        }
        return countEvenNumbers;
    }
}