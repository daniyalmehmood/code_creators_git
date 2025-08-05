public class UnLuckyOne {
    public static boolean unlucky1(int[] nums) {
        int numLength = nums.length;
        if (numLength >= 2 && nums[0] == 1 && nums[1] == 3){ return true;}
        if (numLength >= 3 && nums[1] == 1 && nums[2] == 3) {return true;}
        if (numLength >= 2 && nums[numLength - 2] == 1 && nums[numLength - 1] == 3){ return true;
    }
        return false;
    }

public static void main(String[] args) {
    System.out.println(unlucky1(new int[]{1, 3, 4, 5}));
    System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5}));
    System.out.println(unlucky1(new int[]{1, 1, 1}));
}
}