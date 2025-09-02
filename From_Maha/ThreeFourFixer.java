public class ThreeFourFixer {
    public int[] rearrangeThreeFour(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] == 4 && (j == 0 || numbers[j - 1] != 3)) {
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
