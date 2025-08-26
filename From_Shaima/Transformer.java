import java.util.ArrayList;
import java.util.List;
public class Transformer {
    public static List<Integer> transformAdd1Multiply10(List<Integer> nums) {
        nums.replaceAll(n->(n+1)*10); // replace each element in the 'nums' list after adding 1 to value and multiply by 10
        return nums; // return strings after modification
    }
    public  static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3)); //create a list of integer values and assign the elements 1,2,3
        System.out.println(transformAdd1Multiply10(numbers));
    }

}
