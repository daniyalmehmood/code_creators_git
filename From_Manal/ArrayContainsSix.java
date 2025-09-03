public class ArrayContainsSix {

    // Recursive function to check if array contains 6
    public static boolean array6(int[] numbers, int index) {
        //  reached end of array
        if (index >= numbers.length) {
            return false;
        }

        // Check current element
        if (numbers[index] == 6) {
            return true;
        }

        //check next element
        return array6(numbers, index + 1);
    }

    public static void main(String[] args) {
        System.out.println("array6([1, 6, 4], 0) = " + array6(new int[]{1, 6, 4}, 0));
        System.out.println("array6([1, 4], 0) = " + array6(new int[]{1, 4}, 0));     
        System.out.println("array6([6], 0) = " + array6(new int[]{6}, 0));          
    }
}