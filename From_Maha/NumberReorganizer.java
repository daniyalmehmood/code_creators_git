public class NumberReorganizer {
    public int[] arrangeEvenBeforeOdd(int[] inputArray) {
        int[] arrangedArray = new int[inputArray.length];
        int position = 0;
        // Place even numbers first
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                arrangedArray[position] = inputArray[i];
                position++;
            }
        }
        // Then place odd numbers
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 != 0) {
                arrangedArray[position] = inputArray[i];
                position++;
            }
        }
        return arrangedArray;
    }
}
