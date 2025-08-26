public class CountClumps {

    public int countRepeatedSequences(int[] nums) {

        int count=0;
        boolean inClump = false;
        for (int i=0; i<nums.length-1;i++){

            if (nums[i]==nums[i+1]) {
                if (!inClump){
                    count++;
                    inClump=true;
                }
            }
            else inClump=false;


        }

        return count;

    }
}
