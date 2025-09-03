import java.util.Arrays;

public class CreateExclusiveRange {
    public static int[] generateRangeUpToEndExclusive(int start, int end) {
        int arrayLength= end-start;
        int[] fizzArray= new int[arrayLength];
        for (int i=0 ; i<arrayLength ; i++){
            fizzArray[i]=i+start;
        }
        return fizzArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateRangeUpToEndExclusive(5, 10)));
        System.out.println(Arrays.toString(generateRangeUpToEndExclusive(11, 18)));
        System.out.println(Arrays.toString(generateRangeUpToEndExclusive(1, 3)));
    }
}
