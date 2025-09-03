    public class ArrayDifferenceCalculator {

        public static int calculateMaxMinDifference(int[] numbers) {
            int minValue = numbers[0];
            int maxValue = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                minValue = Math.min(minValue, numbers[i]);
                maxValue = Math.max(maxValue, numbers[i]);
            }

            return maxValue - minValue;
        }

        public static void main(String[] args) {
            System.out.println(calculateMaxMinDifference(new int[]{10, 3, 5, 6}));
            System.out.println(calculateMaxMinDifference(new int[]{7, 2, 10, 9}));
            System.out.println(calculateMaxMinDifference(new int[]{2, 10, 7, 2}));
        }
    }