public class Array667 {

    public static int array667(int[] nums) {
        int count667 = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 6) {

                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    count667++;
                }

            }
        }
        return count667;
    }





        public static void main(String [] args){

            System.out.println( Array667.array667(new int[]{6,6,2}));
            System.out.println( Array667.array667(new int[]{6,6,2,6}));
            System.out.println( Array667.array667(new int[]{6,7,2,6}));
            System.out.println( Array667.array667(new int[]{6, 6, 2, 6, 7}));
            System.out.println( Array667.array667(new int[]{3, 6, 7, 6}));
            System.out.println( Array667.array667(new int[]{3, 6, 6, 7}));

        }
    }


