public class ArrayCount9 {
    public static void main(String[] args) {
        System.out.println(arrayCount9(new int[] {1, 2, 9})); //1
        System.out.println(arrayCount9(new int[] {1, 9, 9})); //2
        System.out.println(arrayCount9(new int[] {1, 9, 9, 3, 9})); //3
    }
    public static int arrayCount9(int[] nums) {
        int count9 = 0;
        for (int num : nums){
            if(num == 9){
                count9++;
            }
        }
        return count9;
    }
}
