public class NoTriplesCheck {
    //returns True if there are No Trieples Number in the array
    public static boolean hasNoTriples(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false; //Triples found
            }
        }
        return true; //No Triples found
    }

    public static void main(String[] arg) {
        System.out.println(hasNoTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(hasNoTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(hasNoTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }
}