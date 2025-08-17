public class RemoveTens {

    public static int[] withoutTen(int[] numbers) {
        int index = 0; 

        // Move non-10 elements to the front
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 10) {
                numbers[index] = numbers[i];
                index++;
            }
        }

        for (int i = index; i < numbers.length; i++) {
            numbers[i] = 0;
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 10, 2};
        int[] arr2 = {10, 2, 10};
        int[] arr3 = {1, 99, 10};

        System.out.println(java.util.Arrays.toString(withoutTen(arr1))); 
        System.out.println(java.util.Arrays.toString(withoutTen(arr2))); 
        System.out.println(java.util.Arrays.toString(withoutTen(arr3))); 
    }
}