public class HasTwoSevenOne {
    public static boolean has271(int[] nums) {
    for(int i=0; i<nums.length-2;i++){
        int x=nums[i];
        int addto5=nums[i+1];
        int minusof1=nums[i+2];

        if (addto5 == x + 5 && Math.abs(minusof1 - (x - 1)) <= 2) {
            return true;
        }
    }
  return false;
}
    public static void main(String[] args) {
        System.out.println(has271(new int[] {1, 2, 7, 1}));
        System.out.println(has271(new int[] {1, 2, 8, 1}));
        System.out.println(has271(new int[] {2, 7, 1}));
    }
}