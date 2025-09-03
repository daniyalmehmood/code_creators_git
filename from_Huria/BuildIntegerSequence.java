import java.util.Arrays;

public class BuildIntegerSequence {
    public static int[] buildIntegerSequence(int n) {
        int fizzArray[] = new int[n];
        for(int i=0; i<n ; i++){
            fizzArray[i] = i;
        }
        return fizzArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildIntegerSequence(4)));
        System.out.println(Arrays.toString(buildIntegerSequence(1)));
        System.out.println(Arrays.toString(buildIntegerSequence(10)));
    }
}
