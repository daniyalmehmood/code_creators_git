public class FizzArray {

    public int[] createSequentialArray(int n) {

        int[] nums= new int[n];
        for (int i=0; i<n; i++){
            nums[i] = i;
        }
        return nums;
    }

}
