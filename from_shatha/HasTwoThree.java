public class HasTwoThree {
    public static boolean hasTargetElements(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }


        public static void main(String[] args){
            System.out.println(hasTargetElements(new int[] {2,5}));
            System.out.println(hasTargetElements(new int[] {4,3}));
            System.out.println(hasTargetElements(new int[] {4,5}));

        }
    }


