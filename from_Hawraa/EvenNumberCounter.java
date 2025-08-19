// Array-2 > countEvens
public class EvenNumberCounter {
    public static int countEvenNumbers(int[] nums) {
        int count = 0;
        for (int i =0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countEvenNumbers(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvenNumbers(new int[]{2, 2, 0}));
        System.out.println(countEvenNumbers(new int[]{1, 3, 5}));
    }
}
