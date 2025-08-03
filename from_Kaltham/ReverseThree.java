public class ReverseThree {
    public int[]reverse3(int[]nums) {
        int[]newArray = new int[3]; ;
        int j = 2;
        for (int i = 0; i < nums.length; i++) {
            newArray[j] = nums[i];
            j--;
        }

        return newArray;
    }
}