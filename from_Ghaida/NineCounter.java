public class NineCounter {
    public static void main(String[] args) {
        System.out.println(countNines(new int[] {1, 2, 9})); //1
        System.out.println(countNines(new int[] {1, 9, 9})); //2
        System.out.println(countNines(new int[] {1, 9, 9, 3, 9})); //3
    }
    public static int countNines(int[] nums) {
        int count9 = 0;
        for (int num : nums){
            if(num == 9){
                count9++;
            }
        }
        return count9;
    }
}
