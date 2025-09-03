public class AfterFourExtractor {
    public static int[] post4(int[] numbers) {
        int lastIndexOf4 = -1;

        // Find the index of the last 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                lastIndexOf4 = i;
            }
        }

        // If no 4 is found, return an empty array
        if (lastIndexOf4 == -1 || lastIndexOf4 == numbers.length - 1) {
            return new int[0];
        }
        
        // Create a new array for elements after the last 4
        int[] result = new int[numbers.length - lastIndexOf4 - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers[lastIndexOf4 + 1 + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 2};
        int[] arr2 = {4, 1, 4, 2};
        int[] arr3 = {4, 4, 1, 2, 3};

        System.out.println(java.util.Arrays.toString(post4(arr1))); 
        System.out.println(java.util.Arrays.toString(post4(arr2)));
        System.out.println(java.util.Arrays.toString(post4(arr3))); 
    }
}