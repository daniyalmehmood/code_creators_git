public class ArrayBegining {

    public static boolean arrayFront9(int[] nums) {

        int max =0;

        if(nums.length > 4 ){max = 4;}else max = nums.length;

        for (int i = 0; i < max; i++) {



            if (nums[i] == 9) {

                return true;
            }


        }
        return false;


    }



    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 9, 6};
        int[] arr2 = {1,2,3};

        System.out.println(arrayFront9(arr));
        System.out.println(arrayFront9(arr2));

    }

}
