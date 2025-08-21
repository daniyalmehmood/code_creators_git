public class ClumpCounter{
public int countAdjacentClumps(int[] nums) {

        int countClumps=0;
        int sumClumps=0;

        for(int i=0;i< nums.length-1;i++){ 
            
                if(nums[i]==nums[i+1]){
                    countClumps=1;
                }
                else{
                   if(countClumps>0){
                       sumClumps+=countClumps;
                       countClumps=0;

                   }
                }
            }
        
            sumClumps+=countClumps;
        
        return sumClumps;
    }
}