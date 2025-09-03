// Method returns true if the given value is "everywhere" in the array

    public class ValueEverywhereChecker {

        public static boolean isEverywhere(int[] numbers, int val) {
            for (int i = 0; i < numbers.length - 1; i++) {
                // check each adjacent pair
                if (numbers[i] != val && numbers[i + 1] != val) {
                    return false; // found a pair without the value
                }
            }
            return true; // every pair has at least one occurrence of val
        }

        public static void main(String[] args) {
            System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 1));
            System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 2));
            System.out.println(isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
        }
    }