public class SearchMaxFirstMiddleLast {
    public static int findMaxOfFirstMiddleLast(int[] nums) {
        int max = nums[0]; //initialize a variable 'max' and assigned to be the first element in the array
        int middleElement = nums[nums.length / 2]; //initialize a variable 'middleElement' and assigned to be the middle element in the array
        int lastElement = nums[nums.length - 1]; //initialize a variable 'lastElement' and assigned to be the last element in the array
        if (max < middleElement) // compare 'max' value and  'middleElement' value
        {
            max = middleElement; //update 'max' value to be the 'middleElement' value
            if (max < lastElement) //compare 'max' value and 'lastElement' value
            {
                max = lastElement; //update 'max' value to be the 'lastElement' value
            }
        }
        if (max < lastElement) // while 'max' value is greater than 'middleElement' value , compare 'max' value and 'lastElement' value
        {
            max = lastElement; //update 'max' value to be the 'lastElement' value , while 'max' value is less than 'lastElement' value
        }

        return max;// return 'max' value
    }
    public static void main(String[] args) {
        System.out.println(findMaxOfFirstMiddleLast(new int[]{1, 2, 3, 4 ,5}));
        System.out.println(findMaxOfFirstMiddleLast(new int[]{5, 1, 7, 9, 7, 8, 1}));
    }
}
