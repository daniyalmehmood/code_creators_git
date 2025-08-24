import java.util.Arrays;
import java.util.List;

public class RemoveNegatives {//Functional-2 > noNeg

    public static void main(String[] args) {
        System.out.println(removeNegatives(Arrays.asList(1, -2)));              // → [1]
        System.out.println(removeNegatives(Arrays.asList(-3, -3, 3, 3)));       // → [3, 3]
        System.out.println(removeNegatives(Arrays.asList(-1, -1, -1)));         // → []
    }
    public static List<Integer> removeNegatives(List<Integer> nums) {
        nums.removeIf(number -> number < 0);
        return nums;
    }
}