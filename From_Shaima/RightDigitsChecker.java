import java.util.ArrayList;
import java.util.List;
public class RightDigitsChecker {
    public static List<Integer> extractRightDigits(List<Integer> nums) {
        nums.replaceAll(n->n%10); // replace each element in the 'nums' list to right digits in the numbers
        return nums; // return strings after modification
    }
    public  static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 22, 93)); //create a list of integer values and assign the elements 1,2,3
        System.out.println(extractRightDigits(numbers));
    }
}
