// Method returns true if the array contains two 7's next to each other or separated by one element

    public class Has77Checker {

        public static boolean has77(int[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 7) {

                    if (i + 1 < numbers.length && numbers[i + 1] == 7) {
                        return true; // two 7's next to each other
                    }

                    if (i + 2 < numbers.length && numbers[i + 2] == 7) {
                        return true; // two 7's separated by one element
                    }
                }
            }
            return false; // no matching 7's found
        }

        public static void main(String[] args) {
            System.out.println(has77(new int[]{1, 7, 7}));
            System.out.println(has77(new int[]{1, 7, 1, 7}));
            System.out.println(has77(new int[]{1, 7, 1, 1, 7}));
        }
    }