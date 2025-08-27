public class CountClumps {

    public static int countClumps(int[] nums) {
        int count = 0;
        boolean inClump = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    count++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] testCases = {
                {1, 2, 2, 3, 4, 4},
                {1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 2, 3, 4},
                {5, 5, 6, 6, 6, 7, 8, 8}
        };

        for (int[] test : testCases) {
            System.out.print("Input: ");
            for (int num : test) System.out.print(num + " ");
            System.out.println("\nClumps: " + countClumps(test));
            System.out.println("-----");
        }
    }
}