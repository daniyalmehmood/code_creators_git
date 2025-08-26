import java.util.ArrayList;
import java.util.List;
public class ListSquarer {
    public static List<Integer> getSquaredList(List<Integer> nums) {
        nums.replaceAll (n-> n*n); // replace each element in the 'nums' list to squared value
        return nums; //return modified list after squared
    }
    public  static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3)); //create a list of integer values and assign the elements 1,2,3
        System.out.println(getSquaredList(numbers));
    }
}
