public class ArrayCount9 {
    public static int arrayCount9(int[] nums) {
            int count9=0;
        for (int i=0; i< nums.length;i++){

            if(nums[i]==9) {
                count9++;
            }
        }
        return count9;
    }

    public static void main(String[] args) {
        System.out.println(arrayCount9(new int[] {1,2,3,4,9,9,9}));
    }


}
