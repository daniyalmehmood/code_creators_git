public class RotateArrayElement {
    public int[] rotateArrayElementToLeft(int[] nums) {
        int [] rotateToLeftElement=new int[nums.length];
        rotateToLeftElement[0]=nums[1];
        rotateToLeftElement[1]=nums[2];
        rotateToLeftElement[2]=nums[0];
        return rotateToLeftElement;
    }

}
