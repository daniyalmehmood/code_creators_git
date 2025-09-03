//Array-3 > fix45
public class FourFiveFixer {
    public static int[] rearrangeFourFive(int[] nums) {
        for(int i=0; i< nums.length;i++){
            if(nums[i]==4 && nums[i+1] !=5){
                int indexAfterFour = i+1;
                int numberAfterFour = nums[i+1];

                for(int j=0; j< nums.length;j++){
                    if(nums[j]==5 && (j==0 || nums[j-1]!=4)){
                        nums[indexAfterFour]=nums[j];
                        nums[j]=numberAfterFour;
                        break;
                    }
                }


            }
        }
        return nums;

    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(rearrangeFourFive(new int[]{5, 4, 9, 4, 9, 5})));
        System.out.println(java.util.Arrays.toString(rearrangeFourFive(new int[]{1, 4, 1, 5})));
        System.out.println(java.util.Arrays.toString(rearrangeFourFive(new int[]{1, 4, 1, 5, 5, 4, 1})));

    }
}