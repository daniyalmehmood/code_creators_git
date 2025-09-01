public class ArrayEvenCounter {
    public static int countEvenNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++) { // go through the array
            if (nums[i] % 2 == 0) { // even number
                count++; 
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countEvenNumbers(new int[]{2, 1, 2, 3, 4}));
    }
}
