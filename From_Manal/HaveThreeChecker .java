// Method checks if the array contains exactly three 3's and no two 3's are adjacent

    public class HaveThreeChecker {

        public static boolean hasThreeNonAdjacent(int[] nums) {
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 3) {
                    count++;
                    // check next element to prevent adjacent 3's
                    if (i < nums.length - 1 && nums[i + 1] == 3) {
                        return false; // two 3's are adjacent
                    }
                }
            }

            return count == 3;
        }

        public static void main(String[] args) {
            System.out.println(hasThreeNonAdjacent(new int[]{3, 1, 3, 1, 3}));
            System.out.println(hasThreeNonAdjacent(new int[]{3, 1, 3, 3}));
            System.out.println(hasThreeNonAdjacent(new int[]{3, 4, 3, 3, 4}));
        }
    }