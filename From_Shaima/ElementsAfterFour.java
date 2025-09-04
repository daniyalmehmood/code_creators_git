import java.util.Arrays;
public class ElementsAfterFour {
    public static int[] getAllElementsAfterTheLastFour(int[] nums) {
        int lastFour=-1;
        for (int i=0 ; i<nums.length ; i++){ // use for loop to go through the array
            if (nums[i]==4){ // check if the element is 4
                lastFour=i; // make the variable to hold the index of element 4
            }
        }
        int newArrayLength = nums.length-lastFour-1;
        int arrayAfterFour[]= new int[newArrayLength];
        for (int i=0 ; i<newArrayLength ;i++){
            arrayAfterFour[i]= nums[lastFour+i+1];
        }
        return arrayAfterFour;
    }
    public static void main(String[] args) {
        int[] result = getAllElementsAfterTheLastFour(new int[]{4, 4, 1, 2, 3});
        System.out.println(Arrays.toString(result));
    }
}
