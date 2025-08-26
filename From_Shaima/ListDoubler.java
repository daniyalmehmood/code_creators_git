import java.util.ArrayList;
import java.util.List;
public class ListDoubler {
    public static List<Integer> getDoubledList(List<Integer> nums) {
        nums.replaceAll(n -> n * 2); // replace each element in the 'nums' list to doubled value
        return nums; //return modified list after doubled
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3)); //create a list of integer values and assign the elements 1,2,3
        System.out.println(getDoubledList(numbers));
    }
}
