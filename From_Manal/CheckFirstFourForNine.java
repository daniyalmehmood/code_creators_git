public class CheckFirstFourForNine {
    public static boolean hasNineInFirstFour(int[] nums) {
        //return true if one of the first 4 elements in the array is a 9

        int limit =nums.length;
        if(limit>4) limit=4;
        for (int i=0; i< limit; i++) {
            if (nums[i] ==9){return true;}

        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasNineInFirstFour(new int[]{1, 2, 9, 3, 4}));
        System.out.println(hasNineInFirstFour(new int[]{1, 2, 3, 4, 9}));
        System.out.println(hasNineInFirstFour(new int[]{1, 2, 3, 4, 5}));
    }
}
