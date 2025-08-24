public class ArrayPatternCheckerDoubleSixAndSixSeven {
    public static int countDoubleSixAndSixSevenInArray(int[] nums) {
        int count =0; // initialize  'count' variable and assign 0 to its
        for (int i=0 ; i<nums.length-1; i++) // using a for loop to go through each element in the array
        {
            if (nums[i]==6 && nums[i+1]==6||nums[i+1]==7 ) //check in the array if contains 6  followed by 6 or by 7
                {
                    count++; // +1 to the count variable if the condition is true
                }
        }
        return count; // return the value of 'count'
    }
    public static void main(String[] args){
        System.out.println(countDoubleSixAndSixSevenInArray(new int[]{6, 6, 2}));
        System.out.println(countDoubleSixAndSixSevenInArray(new int[]{6, 6, 2, 6}));
        System.out.println(countDoubleSixAndSixSevenInArray(new int[]{6, 7, 2, 6}));
    }
}
