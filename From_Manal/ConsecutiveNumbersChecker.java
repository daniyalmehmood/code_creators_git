public class ConsecutiveNumbersChecker {

    public static boolean hasThreeConsecutiveEvenOrOdd(int[] numbers) {
        // Loop through the array, stopping 2 elements before the end
        for (int i = 0; i < numbers.length - 2; i++) {
            // Check if three consecutive numbers are all even
            if (numbers[i] % 2 == 0 && numbers[i+1] % 2 == 0 && numbers[i+2] % 2 == 0) {
                return true;
            }
            // Check if three consecutive numbers are all odd
            if (numbers[i] % 2 != 0 && numbers[i+1] % 2 != 0 && numbers[i+2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 5};
        int[] arr2 = {2, 1, 2, 5};
        int[] arr3 = {2, 4, 2, 5};

        System.out.println(hasThreeConsecutiveEvenOrOdd(arr1));
        System.out.println(hasThreeConsecutiveEvenOrOdd(arr2));
        System.out.println(hasThreeConsecutiveEvenOrOdd(arr3));
    }
}