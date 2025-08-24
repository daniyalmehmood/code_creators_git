// Method returns the sum of array numbers, ignoring sections from 6 to the next 7

    public class ArraySumIgnoreSixToSeven {

        public static int sumIgnoringSixToSeven(int[] numbers) {
            int sum = 0;
            boolean skipping = false;

            for (int num : numbers) {
                if (num == 6) {
                    skipping = true; // start ignoring
                }
                if (!skipping) {
                    sum += num; // add only if not skipping
                }
                if (skipping && num == 7) {
                    skipping = false; // stop ignoring
                }
            }

            return sum;
        }

        public static void main(String[] args) {
            System.out.println(sumIgnoringSixToSeven(new int[]{1, 2, 2}));
            System.out.println(sumIgnoringSixToSeven(new int[]{1, 2, 2, 6, 99, 99, 7}));
            System.out.println(sumIgnoringSixToSeven(new int[]{1, 1, 6, 7, 2}));
        }
    }