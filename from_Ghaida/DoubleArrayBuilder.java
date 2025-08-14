public class DoubleArrayBuilder {
    public static void main(String[] args) {
        System.out.println(doubleArrayWithLast(new int[]{4, 5, 6}));// → [0, 0, 0, 0, 0, 6]
        System.out.println(doubleArrayWithLast(new int[]{1, 2}));// → [0, 0, 0, 2]
        System.out.println(doubleArrayWithLast(new int[]{3}));// → [0, 3]);
    }
    public static int[] doubleArrayWithLast(int[] nums) {
        int[] result = new int[nums.length * 2];//double the length of array
        result[result.length - 1] = nums[nums.length - 1]; //set the last element to the last element of nums
        return result;
    }
}
