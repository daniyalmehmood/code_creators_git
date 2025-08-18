public class SumThertin {

    public int sumSkipping13AndNext(int[] nums) {

        int sum=0;
        for (int i=0; i<nums.length;){

            if (nums[i] !=13) {
                sum+=nums[i];
                i++;
            } else {
                i+=2;
            }
        }
        return sum;
    }

}
