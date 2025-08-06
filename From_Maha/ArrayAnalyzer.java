public class ArrayAnalyzer {
    // Finds the largest value among the first, middle, and last elements of an array.
    public static int findLargestEdgeCenter(int[] nums) {
        int large=0;
        int first= nums[0];
        int middle=nums[nums.length/2];
        int last=nums[nums.length -1];
        if (first > large) {
            large = first;
        }
        if(middle>large){
            large=middle;
        }
        if(last>large){
            large=last;
        }
        return large;


    }
    }