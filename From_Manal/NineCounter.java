public class NineCounter {
    public static int countNumberNine(int[] nums) {

        int count = 0;

        for(int i= 0; i< nums.length; i++) {
            if (nums[i]==9){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(countNumberNine(new int[]{1, 9, 9}));
        System.out.println(countNumberNine(new int[]{1, 9, 9}));
        System.out.println(countNumberNine(new int[]{1, 9, 9, 3, 9}));
    }
}
