public class NineCounter {
    public static int Count9(int[] nums) {
        int count = 0;  // initialize  'count' variable and assign 0 to its
        for (int i=0 ; i<nums.length; i++) // using a for loop to go through each element in the array
        {
            if (nums[i]==9) // if the element in the index is 9
            {
                count++; // +1 to the counter
            }
        }
        return count; // return the value of count
    }
    public static void main(String[] args){
        System.out.println(Count9(new int[]{1, 2, 9}));
        System.out.println(Count9(new int[]{1, 9, 9}));
        System.out.println(Count9(new int[]{1, 9, 9, 3, 9}));
    }
}
