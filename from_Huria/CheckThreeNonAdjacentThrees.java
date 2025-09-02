public class CheckThreeNonAdjacentThrees {
    public static boolean hasExactlyThreeNonAdjacentThrees(int[] nums) {
        int foundThree=0;
        for(int i=0 ; i< nums.length-4 ; i++){
            if (nums[i]==3 && nums[i+2]==3 && nums[i+4]==3){
                foundThree++;
            }
        }
        if(foundThree==0)  return false;
        if(foundThree>1) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(hasExactlyThreeNonAdjacentThrees(new int[]{3, 1, 3, 1, 3}));
        System.out.println(hasExactlyThreeNonAdjacentThrees(new int[]{3, 1, 3, 3}));
        System.out.println(hasExactlyThreeNonAdjacentThrees(new int[]{3, 4, 3, 3, 4}));
    }
}
