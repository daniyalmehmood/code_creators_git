public class ArrayCount9 {


    public static int arrayCount9(int[] nums) {

        int count9 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9){
                count9++;
        }

    }

            return count9;
}





        public static void main(String [] args){

            System.out.println( ArrayCount9.arrayCount9(new int[]{1,2,9}));
            System.out.println( ArrayCount9.arrayCount9(new int[]{1,9,9}));
            System.out.println( ArrayCount9.arrayCount9(new int[]{1,9,9,3,9}));
            System.out.println( ArrayCount9.arrayCount9(new int[]{1,2,3}));
            System.out.println( ArrayCount9.arrayCount9(new int[]{}));
            System.out.println( ArrayCount9.arrayCount9(new int[]{4,2,4,3,1}));
            System.out.println( ArrayCount9.arrayCount9(new int[]{9,2,4,3,1}));

        }
    }


