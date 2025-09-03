// Method returns true if the sum of all 2's in the array is exactly 8

    public class SumOfTwosChecker {

        public static boolean sum28(int[] numbers) {
            int sumOfTwos = 0;

            for (int num : numbers) {
                if (num == 2) {
                    sumOfTwos += 2; // add 2 for each 2 found
                }
            }

            return sumOfTwos == 8; // true if sum is exactly 8
        }

        public static void main(String[] args) {
            System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2}));
            System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
            System.out.println(sum28(new int[]{1, 2, 3, 4}));
        }
    }