public class FindTheMaxElement {
    public int[] changeArrayFirstAndLastElementToMaxElement(int[] nums) {
        int max;
        int[] maxNum=new int[nums.length];
        if(nums[0]>nums[nums.length-1])
            max=nums[0];
        else max=nums[nums.length-1];
        maxNum[0]=max;
        maxNum[1]=max;
        maxNum[2]=max;
        return maxNum;
    }

}
