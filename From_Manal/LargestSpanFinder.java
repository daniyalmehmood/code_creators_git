public class LargestSpanFinder {

    // Method to find the largest span in an array
    public static int findLargestSpan(int[] numbers) {
        int largestSpan = 0;

        // Loop through each element as the starting point
        for (int startIndex = 0; startIndex < numbers.length; startIndex++) {
            int value = numbers[startIndex];
            int lastIndex = startIndex;

            // Search for the last occurrence of the same value
            for (int endIndex = numbers.length - 1; endIndex >= startIndex; endIndex--) {
                if (numbers[endIndex] == value) {
                    lastIndex = endIndex;
                    break; 
                }
            }

            int currentSpan = lastIndex - startIndex + 1;

            if (currentSpan > largestSpan) {
                largestSpan = currentSpan;
            }
        }

        return largestSpan;
    }

    public static void main(String[] args) {
        System.out.println(findLargestSpan(new int[]{1, 2, 1, 1, 3}));      
        System.out.println(findLargestSpan(new int[]{1, 4, 2, 1, 4, 1, 4})); 
        System.out.println(findLargestSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
    }
}