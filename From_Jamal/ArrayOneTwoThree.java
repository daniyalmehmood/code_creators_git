public class ArrayOneTwoThree {
    public static boolean array123(int[] nums) {

        for (int i =0; i < nums.length; i++){

            if(nums[i] == 3 ){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int[] num1 = {1,2,3,4,};
        int[] num2 = {1,2,4,6};

        System.out.println(array123(num1));
        System.out.println(array123(num2));

    }

}
