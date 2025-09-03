// Method returns true if the array contains three increasing adjacent numbers

    public class TripleUpChecker {

        public static boolean tripleUp(int[] nums) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i+1] == nums[i] + 1 && nums[i+2] == nums[i+1] + 1) {
                    return true; // found three increasing adjacent numbers
                }
            }
            return false; // no triple found
        }

        public static void main(String[] args) {
            System.out.println(tripleUp(new int[]{1, 4, 5, 6, 2})); // true
            System.out.println(tripleUp(new int[]{1, 2, 3}));       // true
            System.out.println(tripleUp(new int[]{1, 2, 4}));       // false
        }
    }
