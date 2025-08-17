public class ArrayShifter {

    public static int[] shiftLeft(int[] numbers) {
        // If array has 0 or 1 element, no shift is needed
        if (numbers.length <= 1) {
            return numbers;
        }

        int first = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        
        numbers[numbers.length - 1] = first;
        return numbers;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 2, 5, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {1};

        System.out.println(java.util.Arrays.toString(shiftLeft(arr1)));
        System.out.println(java.util.Arrays.toString(shiftLeft(arr2)));
        System.out.println(java.util.Arrays.toString(shiftLeft(arr3))); 
    }
}