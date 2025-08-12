public class SixSevenCounter{
    public static int sixSevenCounter (int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++){
            if((nums[i] == 6 && nums[i + 1] == 6) || (nums[i] == 6 && nums[i + 1] == 7)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(sixSevenCounter(new int[] {6, 6, 2}));
        System.out.println(sixSevenCounter(new int[] {6, 6, 2, 6}));
        System.out.println(sixSevenCounter(new int[] {6, 7, 2, 6}));
    }
}
