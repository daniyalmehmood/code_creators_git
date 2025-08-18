public class TenRun {

    public int[] propagateMultiplesOfTen(int[] nums) {


        int[] result= new int[nums.length];
        boolean check=false;
        int num=0;
        for (int i=0; i<nums.length;i++){

            if (nums[i]%10==0) {
                result[i]=nums[i];
                num=nums[i];
                check=true;}
            else{
                result[i]=nums[i];
            }
            if(check) result[i]=num;
        }
        return result;
    }

}
