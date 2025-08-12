public class ArrayNineCounter {
    public static int arrayNineCounter(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 9){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(arrayNineCounter(new int[] {1, 2, 9}));
        System.out.println(arrayNineCounter(new int[]{1, 9, 9}));
        System.out.println(arrayNineCounter(new int[]{1, 9, 9, 3, 9}));
    }
}
