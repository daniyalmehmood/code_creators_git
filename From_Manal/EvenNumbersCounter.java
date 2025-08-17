public class EvenNumbersCounter {
    // Method to count the number of even integers in the array
    public static int countEvens(int[] numbers) {
        int count = 0; // Counter for even numbers

        // Loop through each number in the array
        for (int num : numbers) {
            // Check if the number is even using modulo operator
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[] {2, 2, 0}));
        System.out.println(countEvens(new int[] {1, 3, 5}));
    }
}