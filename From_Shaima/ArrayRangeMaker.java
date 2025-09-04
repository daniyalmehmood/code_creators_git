import java.util.Arrays;
public class ArrayRangeMaker {
    public static int[] createRangeArray(int start, int end) {
        int arrayLength= end-start;
        int[] fizzArray= new int[arrayLength];
        for (int i=0 ; i<arrayLength ; i++){
            fizzArray[i]=i+start;
        }
        return fizzArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createRangeArray(5,10)));
    }
}
