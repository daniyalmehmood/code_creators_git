public class ArrayEndsChecker {
    public static boolean sameEnds(int[] numbers, int n) {
        // Check if n is valid
        if (n < 0 || n > numbers.length) {
            return false;
        }

        // Compare first n elements with last n elements
        for (int i = 0; i < n; i++) {
            if (numbers[i] != numbers[numbers.length - n + i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {15, 6, 45, 99, 13, 5, 61, 1};
        int[] arr2 = {5, 6, 45, 99, 13, 5, 6};
        int[] arr3 = {5, 6, 45, 99, 13, 5, 6};

        System.out.println(sameEnds(arr1, 5));
        System.out.println(sameEnds(arr2, 2));
        System.out.println(sameEnds(arr3, 3));
    }
}