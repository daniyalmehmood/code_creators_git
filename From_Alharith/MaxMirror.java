public class MaxMirror {

    public int getMaxMirrorLength(int[] nums) {

        int maxLen=0;

        for (int i=0; i<nums.length; i++){
            for (int j=nums.length-1; j>=0; j--){
                int length=0;
                for(int x=i, y=j; x<nums.length && y>=0 && (nums[x] == nums[y]); x++,y--){
                    length++;
                }

                if (maxLen<length) maxLen=length;
            }
        }
        return maxLen;
    }

}
