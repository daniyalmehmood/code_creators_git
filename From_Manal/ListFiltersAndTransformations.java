import java.util.List;

public class ListFiltersAndTransformations {

    //  Remove all negative numbers
    public List<Integer> removeNegatives(List<Integer> numbers) {
        numbers.removeIf(n -> n < 0);
        return numbers;
    }
}