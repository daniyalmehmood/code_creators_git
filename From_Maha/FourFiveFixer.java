public class FourFiveFixer {
    public int[] rearrangeFourFive(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] == 5 && (j == 0 || numbers[j - 1] != 4)) {
                        int temp = numbers[i + 1];
                        numbers[i + 1] = numbers[j];
                        numbers[j] = temp;
                        break;
                    }
                }
            }
        }
        return numbers;
    }
}
