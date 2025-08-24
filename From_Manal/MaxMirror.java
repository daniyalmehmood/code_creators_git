//Array-3 > maxMirror
public class MaxMirror {
    public static int maxMirror(int[] nums) {
        int max = 0;
        // Loop over start positions in forward direction
        for (int i = 0; i < nums.length; i++) {
            // Loop over start positions in backward direction
            for (int j = nums.length - 1; j >= 0; j--) {
                int length = 0; 

                int a = i; // forward pointer
                int b = j; // backward pointer

                // Count matching elements while both are in bounds
                while (a < nums.length && b >= 0 && nums[a] == nums[b]) {
                    length++;
                    a++;
                    b--;
                }
                max = Math.max(max, length);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1})); 
        System.out.println(maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }
}