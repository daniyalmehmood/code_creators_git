//Array-3 > canBalance
public class ThreeAndFourFixer {

    // Method to rearrange so that every 3 is followed by a 4
    public static int[] fixThreeAndFour(int[] numbers) {
        int nextFourIndex = 0; // pointer to search for available 4's

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 3) {
                if (numbers[i + 1] != 4) {
                    while (numbers[nextFourIndex] != 4 ||
                            (nextFourIndex > 0 && numbers[nextFourIndex - 1] == 3)) {
                        nextFourIndex++;
                    }

                    // Swap the number after 3 with this found 4
                    int temp = numbers[i + 1];
                    numbers[i + 1] = 4;
                    numbers[nextFourIndex] = temp;
                }
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        System.out.println((fixThreeAndFour(new int[]{1, 3, 1, 4}));
        System.out.println(fixThreeAndFour(new int[]{1, 3, 1, 4, 4, 3, 1}));
        System.out.println(fixThreeAndFour(new int[]{3, 2, 2, 4}));
    }
}