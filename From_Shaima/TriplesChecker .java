public class TriplesChecker {
    public static boolean hasNoTriples(int[] nums) {
        if (nums.length<3) // check if the array length is less than 3
        {  
            return true; // the output will be true , because no triple is in the array .
        }
        for (int i=0 ; i<nums.length-1; i++)  // if the array length more or equal 3 , check the value of elements of array
        {
            if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2])  // if the value of element1 == value of element2 == value of element3
            {
                return false; // return false if there is a triple
            }
        }
        return true; // return true while no triple found in the array
    }
    public static void main(String[] args){
        System.out.println(hasNoTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(hasNoTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(hasNoTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }
}
