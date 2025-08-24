public class ArraySixSixSeven {
    public static int array667(int[] nums) {
            int count =0;

            for (int i = 0; i< nums.length-1; i++){


                if(((nums[i] == 6 && nums[i+1] == 6) ||( nums[i+1]==7)) ){
                    count++;

                }
            }
            return count;

        }



    public static void main(String[] args) {
        System.out.println(array667(new int[] {6,6,1}));
        System.out.println(array667(new int[] {6,7,6}));
        System.out.println(array667(new int[] {6,6,7,1}));

    }
}
