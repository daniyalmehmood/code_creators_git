import java.util.Arrays;

public class ArrayGenerator {
    public static int[] buildCountingArray(int n) {
        int[] fizzArray = new int[n]; // initializing array
        for (int i=0 ; i<n ; i++){ // use for loop to go to the new array
            fizzArray[i]=i; // assign elements to the array
        }
        return fizzArray;// return the array
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildCountingArray(4)));
    }
}
