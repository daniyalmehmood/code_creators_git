public class ArrayProcessor {
    public int[] replaceZerosWithMaxOdd(int[] numbers) {
        int maxOdd = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                if (numbers[i] > maxOdd) {
                    maxOdd = numbers[i];
                }
            } else if (numbers[i] == 0) {
                numbers[i] = maxOdd;
            }
        }
        return numbers;
    }
}
