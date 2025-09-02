import java.util.List;

public class ListTransformations {

    // Multiply each number in the list by 2
    public List<Integer> doubleValues(List<Integer> numbers) {
        numbers.replaceAll(n -> n * 2);
        return numbers;
    }
}