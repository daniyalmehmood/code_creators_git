public class SumWithoutUnluckyOneThree {
    // Method to calculate the sum, skipping 13 and the number right after it
    public static int sumWithout13(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 13) {
                i++; 
            } else {
                sum += numbers[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumWithout13(new int[]{1, 2, 2, 1}));
        System.out.println(sumWithout13(new int[]{1, 1}));
        System.out.println(sumWithout13(new int[]{1, 2, 2, 1, 13}));
    }
}