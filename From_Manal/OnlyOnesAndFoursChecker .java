// Method returns true if every element in the array is either 1 or 4

    public class OnlyOnesAndFoursChecker {

        public static boolean only14(int[] numbers) {
            for (int num : numbers) {
                if (num != 1 && num != 4) {
                    return false; // found a number that is not 1 or 4
                }
            }
            return true; // all numbers are 1 or 4
        }

        public static void main(String[] args) {
            System.out.println(only14(new int[]{1, 4, 1, 4}));
            System.out.println(only14(new int[]{1, 4, 2, 4}));
            System.out.println(only14(new int[]{1, 1}));
        }
    }